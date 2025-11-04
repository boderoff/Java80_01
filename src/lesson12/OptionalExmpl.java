package lesson12;

import java.util.*;

public class OptionalExmpl {
    public static Optional<Double> average(List<Integer> list){
        if (list.isEmpty()){ return Optional.empty();}
        else {
            OptionalDouble avg = list.stream()
                    .mapToInt(Integer::intValue).average();
            return avg.isPresent()? Optional.of(avg.getAsDouble()):Optional.empty();
        }
    }
    public static void main(String[] args) {
        List<Integer> test = Arrays.asList(1,2,3);
        Optional<Double> res0 = average(test);
        res0.ifPresentOrElse(avg -> System.out.println(res0), () -> System.out.println("Пусто"));
        List<Integer> test2 = new ArrayList<>();
        Optional<Double> res = average(test2);
        res.ifPresentOrElse(avg -> System.out.println(res), () -> System.out.println("Пусто"));

    }
}

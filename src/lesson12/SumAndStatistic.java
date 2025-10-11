package lesson12;

import java.util.*;

public class SumAndStatistic {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
//                .mapToInt(Integer::intValue)
//                .sum();

        System.out.println(sum);

        Optional<Integer> max = numbers.stream()
                .max(Integer::compare);
        System.out.println(max.get());

        long sumTri = numbers.stream()
                .filter(n -> n % 3 == 0)
                .count();
        System.out.println(sumTri);
    }
}

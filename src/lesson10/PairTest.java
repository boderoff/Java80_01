package lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PairTest {
    public static void main(String[] args) {
        Pair<String, Integer> personAge = new Pair<>("Alice", 30);
        System.out.println(personAge);

        List<Pair<String, Integer>> people = new ArrayList<>();
        people.add(new Pair<>("Alice", 30));
        people.add(new Pair<>("Bob", 25));
        people.add(new Pair<>("Charlie", 35));
        people.add(new Pair<>("Diana", 28));

        //Общий вывод
        System.out.println(people);
        //Циклом
         for (Pair<String, Integer> out : people){
             System.out.println(out);
         }

         Pair<Double, Double> check = new Pair<>(10.2,12.17);
        System.out.println(check);
    }
}

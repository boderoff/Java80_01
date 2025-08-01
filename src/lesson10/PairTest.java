package lesson10;

import java.util.ArrayList;
import java.util.List;

public class PairTest {
    public static void main(String[] args) {
        Pair<String, Integer> personAge = new Pair<>("Alice", 30);
        System.out.println(personAge.toString());

        List<Pair<String, Integer>> people = new ArrayList<>();
        people.add(new Pair<>("Alice", 30));
        people.add(new Pair<>("Bob", 25));
        people.add(new Pair<>("Charlie", 35));
        people.add(new Pair<>("Diana", 28));
    }
}

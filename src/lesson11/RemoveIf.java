package lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class RemoveIf {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("one","", "three","", "five"));

        words.removeIf(s -> s.isEmpty());

        words.forEach(System.out::println);

    }

}

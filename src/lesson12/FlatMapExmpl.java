package lesson12;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMapExmpl {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4),
                Arrays.asList(5));
        List<Integer> allNumbers = listOfLists.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        System.out.println(allNumbers);

    }
}

package lesson12;

import java.util.*;

public class Filtration {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "Bob", "alex", "Charlie", "bob");
        names.stream()
                .filter(f -> f.toUpperCase().startsWith("A"))
                .forEach(f -> System.out.println(f.toUpperCase()));
    }
}

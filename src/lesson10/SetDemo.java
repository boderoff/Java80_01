package lesson10;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> uniqueWords = new LinkedHashSet<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Input string");
        String text = scan.nextLine();
        System.out.printf("Your input: %s \n", text);
        //Разбиваем строку
        String[] words = text.split("\\s+");
        uniqueWords = new LinkedHashSet<>(Arrays.asList(words));
        System.out.println("Unique LinkedHashSet: " + uniqueWords);
        System.out.println("Size: " + uniqueWords.size());

        //Реализация с помощью TreeSet
        Set<String> sortedWords = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        Collections.addAll(sortedWords, words);
        System.out.println("Sorted TreeSet: " + sortedWords);


    }
}

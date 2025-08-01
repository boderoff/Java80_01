package lesson10;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("Алиса", 12345);
        phoneBook.put("Боб", 67890);
        phoneBook.put("Чарли", 54321);
//        System.out.println("All elements: " + phoneBook);
//        System.out.println("Get element by key = Боб: " + phoneBook.get("Боб"));
//        System.out.println("Result check key \"Сергей\" exist: " + phoneBook.containsKey("Сергей"));
        phoneBook.remove("Чарли");
        phoneBook.put("Алиса", 99999);
        System.out.println("Телефонная книга:");
        System.out.println("___________________________");
        for (Map.Entry<String, Integer> entry : phoneBook.entrySet()){
            System.out.println("Имя: " + entry.getKey());
            System.out.println("Телефон: " + entry.getValue());
            System.out.println("___________________________");
        }
    }

}

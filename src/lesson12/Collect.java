package lesson12;
import lesson7.Person;

import java.util.*;
import java.util.stream.Collectors;


public class Collect {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Mow","Moscow"));
        persons.add(new Person("Sergey","Kashira"));
        persons.add(new Person("Ilya","Moscow"));
        persons.add(new Person("Vlad","Kashira"));
        persons.add(new Person("Daniil","Astrahan"));

        Map<String, List<Person>> byCity = persons.stream()
                .collect(Collectors.groupingBy(Person::getCity));
        System.out.println("по городам: " + byCity);

        Map<String, Long> countByCity = persons.stream()
                .collect(Collectors.groupingBy(Person::getCity,Collectors.counting()));
        System.out.println("количество по городам" + countByCity);
    }
}

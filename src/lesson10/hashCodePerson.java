package lesson10;

import lesson8.Person;

import java.util.HashSet;

public class hashCodePerson {
    public static void main(String[] args) {
        HashSet<Person> ex1 = new HashSet<>();
        ex1.add(new Person("Ann", 40));
        ex1.add(new Person("Ann",40));
        System.out.println(ex1);
    }
}

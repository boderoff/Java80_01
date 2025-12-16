package lesson8;

import java.util.Comparator;
import java.util.Objects;
import java.util.SimpleTimeZone;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String message = "Это cообщение";

    public Person(){}

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    private void setMessage(String message){
        this.message = message;
        System.out.println(message);
    }
    private void setMessage2(String message, String name){
        this.message = message;
        this.name = name;
        System.out.println(message + " " + name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return getName() + " " + getAge();
    }

}

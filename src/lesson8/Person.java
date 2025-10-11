package lesson8;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(){}

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
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

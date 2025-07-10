package lesson8;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        //Геометрические фигуры
//        System.out.println("Геометрические фигуры: ");
//        GeometricFigure[] figs = {
//                new Circle("Круг", 4.0),
//                new Triangle("Треугольник с основанием", 23.1, 4.0),
//                new Triangle("Треугольник со сторонами", 12.1, 10.0, 13.2)
//        };
//
//        for (GeometricFigure fig : figs) {
//            System.out.printf("%s: площадь = %.2f%n",
//                    fig.getName(), fig.calculateArea());
//        }
//
//        //Лист с машиной и точкой
//        System.out.println("Точка и Машина:");
//
//        List<Movable> items = new ArrayList<>();
//        items.add(new Point());
//        items.add(new Car());
//
//        for (Movable item : items) {
//            System.out.println(item.getClass().getSimpleName());
//            item.move(10, 20);
//            item.stop();
//        }

        //Player
//        System.out.println("Реализация Player:");
//        Player player = new Player();
//
//        player.play();
//        player.record();
//
//        Playable playable = player;
//        playable.play();
//
//        Recordable recordable = player;
//        recordable.record();

        List<Person> people = new ArrayList<>();
        people.add(new Person("Иван", 25));
        people.add(new Person("Мария", 30));
        people.add(new Person("Алексей", 20));
        people.add(new Person("Ольга", 22));

        // 1. Сортировка с использованием Comparable (по возрасту)
        System.out.println("До сортировки по возрасту:");
        printPeople(people);

        Collections.sort(people); // Использует compareTo из Comparable
        System.out.println("\nПосле сортировки по возрасту:");
        printPeople(people);

        // 2. Сортировка с использованием Comparator (по имени)
        Collections.sort(people, new PersonNameComparator());
        System.out.println("\nПосле сортировки по имени:");
        printPeople(people);
    }

    private static void printPeople(List<Person> people) {
        for (Person person : people) {
            System.out.print(person.getName());
            System.out.print(" ");
            System.out.println(person.getAge());
        }
    }
}

package lesson10;

import java.util.*;

public class Task implements Comparable<Task>{
    private String title;
    private int priority;

    public Task(String title, int priority) {
        this.title = title;
        this.priority = priority;
    }


    @Override
    public int compareTo(Task o) {
        return Integer.compare(this.priority,o.priority);
    }

    public int getPriority() {
        return priority;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return "Task{title: " + title + ", priority: " + priority + "}";
    }

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Выучить коллекции", 2));
        tasks.add(new Task("Сделать зарядку", 1));
        tasks.add(new Task("Прочитать книгу", 3));
        System.out.println(tasks);

        System.out.println("Сортировка по приоритету");
        Collections.sort(tasks);
        for (Task o : tasks) {
            System.out.println(o);
        }

        Comparator<Task> comparatorByTitle = Comparator.comparing(Task::getTitle);
        Collections.sort(tasks, comparatorByTitle);
        System.out.println("Сортировка по названию");
        for (Task o : tasks) {
            System.out.println(o);
        }

    }
}

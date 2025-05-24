package lesson2;

import java.util.Scanner;

public class StringExperimental {
    public static String getYearWord(int a){
        if (a % 100 >= 11 && a % 100 <= 14) {
            return "лет";
        }
        return switch (a % 10) {
            case 1 -> "год";
            case 2, 3, 4 -> "года";
            default -> "лет";
        };
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 23;
        String name = "Влад";
        System.out.println("Я: Меня зовут " + name);
        System.out.print("Введи цифру: ");
        int a = scanner.nextInt();
        System.out.printf("Я: Через %d %s мне будет %d %s\n", a , getYearWord(a), age + a, getYearWord(age+a));
        System.out.print("Я: А скажи сколько тебе лет?:\n");
        System.out.print("Введи свой age, щегол: ");
        int age2 = scanner.nextInt();
        if (age == age2){
            System.out.println("Я: Хуя мы одного возраста!");
        } else if (age > age2) {
            System.out.println("Я: Пиздюк ты ещё...");
        } else {
            System.out.println("Я: Старый, сдохнешь раньше меня.");
        }
    }
}

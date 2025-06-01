package lesson5;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        String[] cities = {"Минск", "Москва", "Вашингтон", "Санкт-Петербург", "Берлин", "Париж"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название города для поиска: ");
        String search = scanner.nextLine();

        for (String city : cities){
            if (city.equalsIgnoreCase(search)){
                System.out.println("Город найден!");
                return; //выходим из main
            }
        }
        System.out.println("Город не найден");
    }
}

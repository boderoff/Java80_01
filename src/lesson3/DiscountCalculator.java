package lesson3;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите купон: ");
        String code = scanner.nextLine();
        switch (code){
            case "SALE10" -> System.out.print("Ваша скидка 10%");
            case "SALE20" -> System.out.print("Ваша скидка 20%");
            case "SALE50" -> System.out.print("Ваша скидка 50%");
            default -> System.out.print("Скидки нет. или введен неверный купон.");
        }
    }
}

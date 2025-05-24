package lesson3;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Введите число: ");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }
        System.out.println("Сумма всех чисел: " + sum);
    }
}

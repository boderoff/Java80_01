package lesson5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = ThreadLocalRandom.current().nextInt(1,101);
        }
        System.out.println("Итоговый массив: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            System.out.printf("№%d = %d ", i, array[i]);
        }
        System.out.println();

        int min = array[0];
        int max = array[0];
        int sum = 0;

        for (int num : array) {
            if (num < min) min = num;
            if (num > max) max = num;
            sum += num;
        }

        double average = (double) sum / n;

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + average);


    }
}

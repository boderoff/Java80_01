package lesson4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayStats {
    public static void main(String[] args) {
        int[] num;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Введите положительные числа(-1 для завершения): ");
        while (true){
            int number = scanner.nextInt();
            if (number == -1){
                break;
            }
            arr.add(number);
        }
        //Переводим ArrayList в обычный массив
        int[] numbers = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            numbers[i] = arr.get(i);
        }

        System.out.println("Минимум: " + min(numbers));
        System.out.println("Максимум: " + max(numbers));
        System.out.println("Сумма: " + sum(numbers));
        System.out.println("Среднее: " + average(numbers));
    }

    static int min(int[] arr){
        int min = arr[0];
        for (int num : arr){
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    static int max(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    static double average(int[] arr){
        return (double) sum(arr)/arr.length;
    }

}

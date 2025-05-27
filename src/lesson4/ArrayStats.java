package lesson4;

import java.util.Scanner;

public class ArrayStats {
    public static void main(String[] args) {
        int[] num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
    }

    static int min(int[] arr){
        int min = arr[0];
        for (int num : arr){
            if (num < min) {
                min = num;
            }
        }
    }
    static int max(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
    }
}

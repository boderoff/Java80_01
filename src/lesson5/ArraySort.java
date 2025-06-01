package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int N = scanner.nextInt();

        int[] array = new int[N];
        System.out.println("Введите " + N + " элементов: ");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        int[] arrayBuiltinSort = Arrays.copyOf(array, N);

        //Ручная сортировка
        bubbleSort(array);
        System.out.println("Ручная сортировка: " + Arrays.toString(array));

        //Сортировка встроенным методом
        Arrays.sort(arrayBuiltinSort);
        System.out.println("Сортировка встроенным методом: " + Arrays.toString(arrayBuiltinSort));
    }

    public static void bubbleSort(int[] arr) {
        int N = arr.length;
        boolean swapped = false;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}

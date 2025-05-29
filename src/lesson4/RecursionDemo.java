package lesson4;

public class RecursionDemo {
    public static void main(String[] args) {
        int[] testValues = {0, 1, 5, 10};
        for (int i = 0; i < testValues.length; i++){
            int n = testValues[i];
            System.out.printf("Factorial %d (recursive) = %d%n", n, factorial(n));
            System.out.printf("Factorial %d (iterative) = %d%n", n, factorialIter(n));
            System.out.printf("Array element %d: ",i);
            printArrayRecursively(testValues,i);
            System.out.print("\n\n");
        }
    }

    static long factorial(int n){
        if (n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }
    static long factorialIter(int n){
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    static void printArrayRecursively(int[] arr, int n){
        if (n == arr.length){
            return;
        }
        System.out.print(arr[n] + " ");
        printArrayRecursively(arr, n + 1);
    }
}

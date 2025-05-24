package lesson2;

public class Calculator {

    public static int plus(int a,int b){
        return a + b;
    }
    public static int minus(int a, int b){
        return a - b;
    }
    public static int multiplication(int a, int b){
        return a * b;
    }
    public static int division(int a, int b){
        if (b == 0) {
            throw new IllegalArgumentException("Делить на ноль нельзя!");
        }
        return a / b;
    }
    public static int modulus(int a, int b){
        if (b == 0) {
            throw new IllegalArgumentException("Делить на ноль нельзя!");
        }
        return a % b;
    }
}

package lesson9;

public class Calculation {
    public static int divide(int a, int b) throws ArithmeticException {
        return a/b;
    }

    public static void main(String[] args) {
        try {
            System.out.println(divide(10, 2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("5 / 0 = " + Calculation.divide(5, 0));
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль!");
        }

        System.out.println("10 / 0 = " + Calculation.divide(10, 0));
    }
}

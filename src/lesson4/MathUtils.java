package lesson4;

public class MathUtils{
    public static void main(String[] args) {
        System.out.println("int multiply: " + multiply(2, 3));
        System.out.println("double multiply: " + multiply(2.5, 4.0));
        System.out.println("string multiply: " + multiply("Hi", 3));
    }

    static int multiply(int a, int b){
        return a*b;
    }
    static double multiply(double a, double b){
        return a*b;
    }
    static String multiply(String str, int n){
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(str).repeat(Math.max(0, n)));
        return sb.toString();
    }
}

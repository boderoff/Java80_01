
package lesson2;
import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ширину: ");
        int a = scanner.nextInt();
        System.out.print("Введиет длину: ");
        int b = scanner.nextInt();
        System.out.println("Площадь = " + Calculator.multiplication(a,b));
        System.out.println("Периметр = " + Calculator.plus(a,b));

    }
}

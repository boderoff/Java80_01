package lesson6;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);

        System.out.println("Площадь круга радиусом 5 = " + circle1.getArea());
        System.out.println("Длина окружности радиусом 5 = " + circle1.getCircumference());
    }
}

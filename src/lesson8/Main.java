package lesson8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        //Геометрические фигуры
//        System.out.println("Геометрические фигуры: ");
//        GeometricFigure[] figs = {
//                new Circle("Круг", 4.0),
//                new Triangle("Треугольник с основанием", 23.1, 4.0),
//                new Triangle("Треугольник со сторонами", 12.1, 10.0, 13.2)
//        };
//
//        for (GeometricFigure fig : figs) {
//            System.out.printf("%s: площадь = %.2f%n",
//                    fig.getName(), fig.calculateArea());
//        }
//
//        //Лист с машиной и точкой
//        System.out.println("Точка и Машина:");
//
//        List<Movable> items = new ArrayList<>();
//        items.add(new Point());
//        items.add(new Car());
//
//        for (Movable item : items) {
//            System.out.println(item.getClass().getSimpleName());
//            item.move(10, 20);
//            item.stop();
//        }

        //Player
        System.out.println("Реализация Player:");
        Player player = new Player();

        player.play();
        player.record();

        Playable playable = player;
        playable.play();

        Recordable recordable = player;
        recordable.record();
    }
}

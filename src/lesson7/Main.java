package lesson7;

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    abstract double getArea();
    public void describe() {
        System.out.print("This is a shape of ");
    }
}

class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void printArea(Shape shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            circle.describe();
            System.out.println("Circle");
            System.out.println("Radius = " + circle.getRadius());
        }
        else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            rectangle.describe();
            System.out.println("Rectangle");
            System.out.println("Width = " + rectangle.getWidth());
            System.out.println("Height = " + rectangle.getHeight());
        }
        else {
            System.out.println("Unknown");
        }
        System.out.println("Area = " + shape.getArea());
        System.out.println("_______________");
    }
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(4.6, 10));
        shapes.add(new Circle(7));
        shapes.add(new Circle(5.5));
        shapes.add(new Rectangle(5,6));

        for (Shape shape : shapes) {
            printArea(shape);
        }
    }
}
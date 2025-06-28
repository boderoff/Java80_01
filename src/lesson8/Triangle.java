package lesson8;

public class Triangle extends GeometricFigure{
    private double sideA;
    private double sideB;
    private double sideC;
    private Double height;

    public Triangle(String name, double sideA, double height) {
        super(name);
        this.sideA = sideA;
        this.height = height;
    }

    public Triangle(String name, double sideA, double sideB, double sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        if (height != null) { return 0.5 * sideA * height; }
        else {
            double p = (sideA + sideB + sideC) / 2;
            return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        }
    }
}

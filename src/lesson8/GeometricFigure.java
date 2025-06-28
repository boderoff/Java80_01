package lesson8;

public abstract class GeometricFigure {
    private String name;
    public abstract double calculateArea();

    public  String getName(){
        return name;
    }
    public GeometricFigure(String name) {
        this.name = name;
    }
}

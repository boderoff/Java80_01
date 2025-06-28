package lesson8;

public class Point implements Movable{
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }
    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Точка перемещена в координаты: (" + x + "," + y + ")");
    }

    @Override
    public void stop() {
        System.out.println("Точка остановлена.");
    }
}

package lesson8;

public class Car implements  Movable{
    private int x;
    private int y;

    public Car() {
        this.x = 0;
        this.y = 0;
    }

    @Override
    public void move(int x, int y) {
        double distance = Math.sqrt(Math.pow(x-this.x, 2) + Math.pow(y-this.y, 2));
        this.x = x;
        this.y = y;
        System.out.printf("Машина проехала дистанцию %.2f до позиции (%d, %d) \n", distance, x, y);
    }

    @Override
    public void stop() {
        System.out.println("Машина остановилась.");
    }
}

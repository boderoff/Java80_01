package lesson6;

public class CounterDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            new Counter();
        }

        System.out.println("Объектов создано: " + Counter.getCount());
    }
}

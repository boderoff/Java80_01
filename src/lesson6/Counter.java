package lesson6;

public class Counter {
    private static int count = 0;

    public Counter() {
        count++;
    }
    public static int getCount() {
        return count;
    }
}

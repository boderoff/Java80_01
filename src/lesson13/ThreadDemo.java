package lesson13;

public class ThreadDemo {
    public static void main(String[] args) {
        long programStart = System.currentTimeMillis();

        Thread t1 = new MyThread();
        Thread t2 = new Thread(new MyRunnable());
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }}
        });
        t1.setName("Thread");
        t2.setName("Runnable");
        t3.setName("Lyambda");
        t1.start(); t2.start(); t3.start();
        System.out.println("Тут уже стартанули");
        try{
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("join 1");
        try{
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("конец");

        long programEnd = System.currentTimeMillis();
        long totalTime = programEnd - programStart;
        System.out.println("Общее время выполнения программы: " + totalTime + "ms");
    }
}

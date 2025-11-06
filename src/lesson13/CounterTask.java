package lesson13;

public class CounterTask implements Runnable{
    static int count;
    public static void main(String[] args) {
        Thread t1 = new Thread(new CounterTask());
        Thread t2 = new Thread(new CounterTask());
        Thread t3 = new Thread(new CounterTask());
        Thread t4 = new Thread(new CounterTask());
        Thread t5 = new Thread(new CounterTask());
        t1.start();t2.start();t3.start();t4.start();t5.start();
        try {
            t1.join();t2.join();t3.join();t4.join();t5.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(count);
    }

    @Override
    public void run() {
        for(int i=0; i<5000; i++){
            synchronized(CounterTask.class) {count++;}
        }
    }
}

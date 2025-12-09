package lesson13;

public class BlockingEx {
    static Object a = new Object(); static Object b = new Object();
    private static void lockInOrder(Object x, Object y){
        Object z = x;
        Object c = y;
        if (System.identityHashCode(x) > System.identityHashCode(y)) {
            z = y;
            c = x;
        }
        synchronized (z) {
            synchronized (c) {
                System.out.println(Thread.currentThread().getName() +
                        " захватил мониторы в порядке: " + System.identityHashCode(z) +
                        " ->" + System.identityHashCode(c) );
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
    public static void main(String[] args) {
        Thread T1 = new Thread(()-> {
                System.out.println("t1 try to catch a -> b");
                lockInOrder(a, b);
            System.out.println("t1 end");
        });

        Thread T2 = new Thread(() -> {
                System.out.println("t2 try to catch b -> a");
                lockInOrder(b,a);
                System.out.println("t2 end");

        });
        T1.start();T2.start();

        try {
            T1.join(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            T2.join(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (!T1.isAlive() && !T2.isAlive()) {
            System.out.println("УСПЕХ! Оба потока завершились без дедлока");
        } else {
            System.out.println("Проблема: потоки не завершились");
        }
    }
}

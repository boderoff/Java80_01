package lesson13;

import java.util.Random;

class Monitor {
    public Integer sharedData = null;
    public final Object lock = new Object();
}
class Producer extends Thread {
    private final Monitor monitor;
    private final Random random = new Random();

    Producer(Monitor monitor) {
        this.monitor = monitor;
    }

    public void run(){
        try {
            synchronized (monitor.lock) {
                for (int i = 0; i < 5; i++) {
                    //Если что-то есть, то ничего не делаем, ждем
                    while (monitor.sharedData != null) {
                        try {
                            monitor.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    // Генерируем случайное число
                    int number = random.nextInt(100);
                    monitor.sharedData = number;
                    System.out.println("Producer сгенерировал: " + number);

                    // Уведомляем потребителя
                    monitor.lock.notify();

                    //Ждем пока консюмер заберет данные
                    if (i < 4) {
                        try {
                            monitor.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    Thread.sleep(2000);
                }
            }
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Producer прерван");
        }

    }
}
class Consumer extends Thread {
    private final Monitor monitor;

    Consumer(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {
        synchronized (monitor.lock) {
            for (int i = 0; i < 10; i++) {
                while (monitor.sharedData == null) {
                    try {
                        monitor.lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                int number = monitor.sharedData;
                monitor.sharedData = null;
                System.out.println("Consumer прочитал: " + number);

                monitor.lock.notify();

                if (i < 9) {
                    try {
                        monitor.lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            //Ждем пока появятся данные


        }
    }
}
class WaitNotifyDemo {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();

        Producer producer = new Producer(monitor);
        Producer producer2 = new Producer(monitor);
        Consumer consumer = new Consumer(monitor);

        System.out.println("Запуск Producer-Consumer демонстрации...");

        producer.start();
        producer2.start();
        consumer.start();

        try {
            producer.join();
            producer2.join();
            consumer.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Демонстрация завершена.");
    }
}

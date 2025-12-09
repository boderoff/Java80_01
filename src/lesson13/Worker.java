package lesson13;

public class Worker {
    private volatile boolean running = false;
    private Thread workerThread;

    public void start() {
        if (running) {
            System.out.println("Already running");
            return;
        }
        running = true;
        workerThread = new Thread(() -> {
            while (running) {
                System.out.println("Tick");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        });

        workerThread.start();
    }

    public void stop() {
        if (!running) {
            System.out.println("Already stop");
            return;
        }
        running = false;
        if (workerThread != null) {
            workerThread.interrupt();
        }

    }
    public void join() throws InterruptedException {
        if (workerThread != null) {
            workerThread.join();
        }
    }
}
class WorkerExample{

    public static void main(String[] args) {
        Worker worker = new Worker();

        System.out.println("=== Запускаем Worker ===");
        worker.start();

        // Ждем ~1 секунду (5 тиков по 200мс)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("=== Останавливаем Worker ===");
        worker.stop();

        System.out.println("=== Ждем завершения Worker ===");
        try {
            worker.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

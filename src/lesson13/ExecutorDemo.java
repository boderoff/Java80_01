package lesson13;


import java.util.*;
import java.util.concurrent.*;


public class ExecutorDemo {
    public static void main(String[] args) {
        long programStart = System.currentTimeMillis();

        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Callable<Integer>> tasks = new ArrayList<>();
        for(int i=1;i<=5;i++){
            int number = i;
            tasks.add(() -> {
                Thread.sleep(1000);
                return number * number;
            });
        }
        try {
            List<Future<Integer>> results = executor.invokeAll(tasks);

            // Получаем результаты из Future
            List<Integer> squaredNumbers = new ArrayList<>();
            for(Future<Integer> future : results) {
                try {
                    Integer result = future.get(); // блокирующий вызов
                    squaredNumbers.add(result);
                    System.out.println("Получен результат: " + result);
                } catch (ExecutionException e) {
                    System.err.println("Ошибка выполнения задачи: " + e.getMessage());
                }
            }

            System.out.println("Все результаты: " + squaredNumbers);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            executor.shutdown(); // важно закрыть executor
        }

        long programEnd = System.currentTimeMillis();
        long totalTime = programEnd - programStart;
        System.out.println("Общее время выполнения программы: " + totalTime + "ms");
    }
}

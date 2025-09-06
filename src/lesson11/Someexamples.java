package lesson11;


import lesson8.Person;

import java.util.*;
import java.util.function.*;


/**
 * Доп задачки реализованны все в main. Тема 11
 */
public class Someexamples {
    public static void main(String[] args) {
        System.out.println("Первая доп задача map.merge");
        Map<String, Integer> map = new HashMap<>();
        String word = "java and java collection";
        String[] a = word.split(" ");
        for (String b : a) {
            map.merge(b, 2, Integer::sum);
        }
        System.out.println(map);

        System.out.println("Вторая доп задача UnaryOperator");
    /**
     *       UnaryOperator<T> — это функциональный интерфейс из пакета java.util.function, который:
     *       -Принимает один аргумент типа T
     *       -Возвращает результат того же типа T
     *       -Наследуется от Function<T, T>
     *       -Используется для операций преобразования объекта в объект того же типа
     */
        List<Integer> nums = Arrays.asList(-1,0,2,-2,1);
        nums.replaceAll(n -> n<0 ? 0 : n);
        System.out.println(nums);

        System.out.println("Третья доп задача: Валидатор логина");
        //Явно определяем предикаты, которые будут вызываться в функции
        Predicate<String> NO_EMPTY = login -> !login.isEmpty();
        Predicate<String> NO_BLANK = login -> !login.isBlank();
        Predicate<String> LENGHT_VALID = login -> login.length()>=3 && login.length()<=16;
        Predicate<String> ALLOW_CHARS = login -> login.matches("^[a-zA-Z0-9_]+$");
        //Пишем общий предикат, который будет всё проверять
        Predicate<String> isValid = NO_EMPTY
                .and(NO_BLANK)
                .and(LENGHT_VALID)
                .and(ALLOW_CHARS);
        //Можно все условия прописать в одном предикате
        Predicate<String> isValid2 = login ->
                login != null &&
                !login.isEmpty() &&
                !login.trim().isEmpty() &&
                login.length() >= 3 &&
                login.length() <= 16 &&
                login.matches("[a-zA-Z0-9_]+");
        // Важно! Необходимо создать изменяемый список, если мы приравняем asList, то список будет неизменяемым и не получится применить функцию удаления
        List<String> logins = new ArrayList<>(Arrays.asList("ab","user_01"," verylongnameeeee ","ok",""));
        List<String> logins2 = new ArrayList<>(Arrays.asList("ab","user_01"," verylongnameeeee ","ok",""));
        //Если выполняется наш предикат - то удаляется, негейт реверсит условие, удаляются только несоответствующие
        logins.removeIf(isValid.negate());
        logins2.removeIf(isValid2.negate());
        System.out.println(logins);
        System.out.println(logins2);

        System.out.println("Четвертая доп задача: Компараторы и method reference");
        List<Person> PersList = new ArrayList<>();
        PersList.add(new Person("Ann",30));
        PersList.add(new Person("bob",34));
        PersList.add(new Person("Carl",25));

        PersList.sort(Comparator.comparing(Person::getAge).thenComparing(p -> p.getName().toLowerCase()));
        System.out.println("Отсортированный список:");
        PersList.forEach(System.out::println);

        PersList.sort(Comparator.comparing(Person::getAge).reversed().thenComparing(p -> p.getName().toLowerCase()));
        System.out.println("Отсортированный список в обратном порядке:");
        PersList.forEach(System.out::println);

        System.out.println("Пятая задачка: Фабрики через ссылки на конструкторы.");
        Supplier<Person> def = Person::new;
        Function<String,Person> byName = Person::new;
        BiFunction<String,Integer,Person> full = Person::new;
        //У Supplier нету функции apply
        System.out.println("1. " + def.get());
        System.out.println("2. " + byName.apply("Alice"));
        System.out.println("3. " + full.apply("Bob", 30));

        System.out.println("Шестая задача: свой map и filter без Stream");
        List<Integer> test = new ArrayList<>(Arrays.asList(1,2,3));
        test = map(test, x -> x*x);
        System.out.println(test);
        List<String> test2 = new ArrayList<>(Arrays.asList("one","two","three"));
        test2 = filter(test2, y -> y.length()==3);
        System.out.println(test2);

        System.out.println("Седьмая задача: Копирование по условию");
        List<Number> dst = new ArrayList<>();
        List<Integer> src = new ArrayList<>();
        src.add(1);src.add(2);src.add(3);src.add(4);
        int n = copyIf(dst,src,x -> x%2==0 );
        System.out.println("Количество элементов в новом списке: "+ n);
        System.out.println(dst);

        System.out.println("Восьмая задача: Топ-К слов");
//        PriorityQueue — это очередь с приоритетом, где элементы упорядочены согласно их естественному порядку или компаратору. Элемент с наивысшим приоритетом всегда находится в начале очереди
        Map<String,Integer> freq = new HashMap<>();
        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>();
        Comparator.comparing(Map.Entry::getValue).thenComparing(Map.Entry::getKey);
        freq.add("java",5);



    }
    /**
     * Аналог Stream.map <br>
     * ? super T - Принимает любой тип, который является супертипом для T. <br>
     * Позволяет передавать более общие (родительские) типы <p>
     * ? extends R - Возвращает любой тип, который является подтипом R. <br>
     * Позволяет возвращать более конкретные (дочерние) типы <br>
     * Преобразует каждый элемент исходного списка с помощью заданной функции
     * и возвращает новый список с результатами преобразования.
     *
     * @param <T> тип элементов исходного списка
     * @param <R> тип элементов результирующего списка
     * @param src исходный список элементов (не может быть null)
     * @param f функция преобразования (не может быть null)
     * @return новый список с преобразованными элементами

     */
    public static <T,R> List<R> map(List<T> src, Function<? super T,? extends R> f) {
        List<R> result = new ArrayList<>();
        for (T element : src) {
            result.add(f.apply(element)); // Применяем функцию к каждому элементу
        }
        return result;
    }

    /**
     * Аналог Stream.filter.
     * @param <T> тип элементов списка
     * @param src исходный список элементов (не может быть null)
     * @param p предикат для фильтрации элементов (не может быть null)
     * @return новый список только с элементами, удовлетворяющими предикату
     */


    public static <T> List<T> filter(List<T> src, Predicate<? super T> p) {
        List<T> result = new ArrayList<>();
        for (T element : src) {
            //test это функция в классе предикатов, которую мы объявляем
            if (p.test(element)) { // Проверяем условие
                result.add(element); //добавляем в лист result
            }
        }
        return result;
    }

    static <T> int copyIf(List<? super T> dst, List<? extends T> src, Predicate<? super T> p){
        List<T> result = new ArrayList<>();
        int n = 0;
        for (T element : src){
            if(p.test(element)) {
                dst.add(element);
                n++;
            }
        }
        return n;
    }

    /**
     *  Создаем кучу с компаратором внутри
     */
    public static List<Map.Entry<String,Integer>> topKFrequent(Map<String,Integer> freq, int k) {
        PriorityQueue<Map.Entry<String,Integer>> pq;
        pq = new PriorityQueue<>(Comparator.comparing(Map.Entry::getValue).thenComparing(Map.Entry::getKey));
        ;
    }
}

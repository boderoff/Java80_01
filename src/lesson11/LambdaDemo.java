package lesson11;

import java.util.function.Function;

public class LambdaDemo {

    public static <T,R> R transform(T value, Function<T,R> function) {
        return function.apply(value);
    }

    public static void main(String[] args) {

        System.out.println(transform("Hello",(String s) -> s + "!!!"));
        System.out.println(transform(5, (Integer x) -> x * x));
        System.out.println(transform("Java", (Function<String, String>) String::toUpperCase));
    }
}

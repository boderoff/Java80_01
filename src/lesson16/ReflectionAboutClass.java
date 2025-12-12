package lesson16;

//import lesson2.Rectangle;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReflectionAboutClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите полное название класса");
        String className = scanner.nextLine().trim();
        try{
            exploreClass(className);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void exploreClass(String className) throws Exception{
        Class<?> exClass = Class.forName(className);
        //Функция для параметров
        Function<Class<?>[],String> formatParams = params ->
                Arrays.stream(params)
                                .map(Class::getSimpleName)
                                        .collect(Collectors.joining(", ","(",")"));

        System.out.println("Исследую класс: " + exClass.getSimpleName());

        System.out.println("Информация:");
        System.out.println("Fields: " + Arrays.stream(exClass.getDeclaredFields())
                .map(f -> Modifier.toString(f.getModifiers()) + " " +
                        f.getType().getSimpleName() + " " +
                        f.getName())
                .collect(Collectors.joining(", ")));
        System.out.println("Methods: " + Arrays.stream(exClass.getDeclaredMethods())
                .map(f -> Modifier.toString(f.getModifiers()) + " " +
                        f.getReturnType() + " " +
                        f.getName() +
                        formatParams.apply(f.getParameterTypes()))
                .collect(Collectors.joining(", ")));
        System.out.println("Constructors: " + Arrays.stream(exClass.getDeclaredConstructors())
                .map (f -> Modifier.toString(f.getModifiers()) + " " +
                        f.getDeclaringClass().getSimpleName() +
                        formatParams.apply(f.getParameterTypes()))
                .collect(Collectors.joining()));
    }
}

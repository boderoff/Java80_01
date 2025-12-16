package lesson16;

import lesson8.Person;

import java.lang.reflect.Field;

public class PrivateFieldChange {
    public static void main(String[] args) throws Exception{
        Person person = new Person("Ilya");
        System.out.println("Поле до изменения: " + person.getName());
        //Вызываем метод
        setField(person,"name","Vlad");
        System.out.println("Поле после изменения: " + person.getName());

    }

    private static void setField(Object target, String fieldName, Object value) throws Exception{
        Field field = target.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(target, value);

    }
}

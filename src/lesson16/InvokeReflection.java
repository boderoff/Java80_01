package lesson16;

import lesson8.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class InvokeReflection {
    public static void main(String[] args) throws Exception{
        Person target = new Person("Vasya");
        Field field = target.getClass().getDeclaredField("message");
        field.setAccessible(true);
        System.out.println(field.get(target));
        invoke(target,"setMessage","Changed0");

        invoke(target,"setMessage2","Changed", "new name");
    }

    private static Object invoke(Object target, String methodName, Object... args)
        throws Exception{
        Class<?> clazz = target.getClass();

        for (Method method : clazz.getDeclaredMethods()){
            if (method.getName().equals(methodName) &&
            method.getParameterCount() == args.length){
                method.setAccessible(true);
                return method.invoke(target,args);
            }
        }
        throw new NoSuchMethodException("Method" + methodName +
                " with " + args.length + " parameters not found.");
    }
}

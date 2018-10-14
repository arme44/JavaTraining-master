package training.core.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

class ReflectionExample {

    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        String classPath = "training.core.annotation.Soldier";
        Class c = Class.forName(classPath);

        Method mAttack =
                c.getDeclaredMethod("attack",
                        new Class[]{});
        Method mOrder =
                c.getDeclaredMethod("confirmOrder",
                        new Class[]{String.class});

        Object o = c.newInstance();
        System.out.println("Object info: " + o.toString());
        mAttack.invoke(o);
        mOrder.invoke(o, "Find Octet Bin Long");

        Field[] fields = c.getDeclaredFields();
        Method[] methods = c.getDeclaredMethods();
        Constructor[] constructors = c.getDeclaredConstructors();
        Annotation[] annotations = c.getDeclaredAnnotations();

        System.out.println("Annotation class:");
        Arrays.stream(annotations)
                .forEach(System.out::println);

        System.out.println("Annotation for constructors:");
        Arrays.stream(constructors)
                .forEach(entry ->
                {
                    System.out.println(entry);
                    Arrays.stream(entry.getDeclaredAnnotations())
                            .forEach(System.out::println);
                });
        System.out.println("Annotation for methods:");
        Arrays.stream(methods)
                .forEach(entry ->
                {
                    System.out.println(entry);
                    Arrays.stream(entry.getDeclaredAnnotations())
                            .forEach(System.out::println);
                });
        System.out.println("Annotation for fields:");
        Arrays.stream(fields)
                .forEach(entry ->
                {
                    System.out.println(entry);
                    Arrays.stream(entry.getDeclaredAnnotations())
                            .forEach(System.out::println);
                });

    }

}
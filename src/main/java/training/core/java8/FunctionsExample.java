package training.core.java8;

import java.util.LinkedList;
import java.util.List;

public class FunctionsExample {



    public static void main(String[] args) {
        List<String> list = new LinkedList<String>() {{
            add("One");
            add("Star Wars");
            add("Rick and Morty");
            add("Fridays");

        }};

        printListJava7Fasion(list);
        printListJava8Fasion(list);
    }

    private static void printListJava7Fasion(List<String>list) {
        for (String el : list) {
            System.out.println(el);
        }

    }
    private static void printListJava8Fasion(List<String> list) {
        list.forEach(e -> System.out.println(e));  // forEach(System.out::println); - dla javy 8

        /*

        rozne sposoby na wywolanie metod lambda

        * e -> metodaNa(e);
        * () -> something();
        * (a,b) -> calculate(a,b);
        * (a,b) -> {
        * calculate(a,b);
        * storeInFile(a,b);          -- nigdzie nie ma return a+b ani jaki typ danych przekazuje
        * return a+b;
        * }
        *
        *
        */
    }





}

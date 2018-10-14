package training.core.java8;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamJava8Example {


    public static void main(String[] args) {

        String[] input = {"Ala", "kot", "Tom", " ", null, "23456", ""};

        StreamJava8Example app = new StreamJava8Example();

        app.printArray(input);
        System.out.println("=======================");
        app.printEmptyEntries(input);
        System.out.println("=======================");
        app.randomize(14);
        System.out.println("=======================");
        app.numberStatistics();


    }

    private void numberStatistics() {
        List numbers = Arrays.asList(3, 4, 5, 6, 7, 1, 5, 9);

        IntSummaryStatistics stats = numbers.stream()
                .mapToInt(x -> Integer.valueOf(x.toString()))
                .summaryStatistics();

        System.out.println("Max " + stats.getMax());
        System.out.println("Min " + stats.getMin());
        System.out.println("Sum " + stats.getSum());
        System.out.println("Avg " + stats.getAverage());
        System.out.println("Amt " + stats.getCount());

    }

    private void randomize(int lim) {
        int[] ints = new Random()
                .ints(0, 100)
                .limit(lim)
                .toArray();
        System.out.println("Random all ints");
        Arrays.stream(ints)
                .forEach(System.out::println);

        System.out.println("Random all sorted");
        Arrays.stream(ints)
                .sorted()
                .forEach(System.out::println);

        System.out.println("Random all sorted unique");
        Arrays.stream(ints)
                .distinct()
                .sorted()
                .forEach(System.out::println);

    }


    private void printArray(String[] array) {
        Arrays.stream(array).forEach(System.out::println);
    }

    private void printEmptyEntries(String[] array) {

        List<String> entries = Arrays.asList(array);

        //  Object[] array1 =
        List<String> list = entries.stream()
                .filter(Objects::nonNull)
                .map(entry -> entry.trim()) //remowe whitespace
                .filter(entry -> !entry.isEmpty())
                .collect(Collectors.toList());

        String[] strings = list.toArray(new String[0]);
        printArray(strings);

        // printArray((String[]) array1);

    }


}

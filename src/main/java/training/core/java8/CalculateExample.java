package training.core.java8;

import java.util.function.BiFunction;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class CalculateExample {

    public static void main(String[] args) {


        MathOperation additional = (a, b) -> a + b;

        MathOperation subbtration = (a, b) -> a - b;

        MathOperation multiplication = (a, b) -> a * b;

        MathOperation division = (a, b) -> a / b;

        // ---------------- inny sposób na BiFunctions interface -------------------- //

        BiFunction<Integer, Integer, Integer> add_1 = (a, b) -> a + b;


        CalculateExample calc = new CalculateExample(); // CalculateExample calc = CalculateExample::new;
        calc.run(2, 2, additional);
        calc.run(5, 1, subbtration);
        calc.run(3, 4, multiplication);
        calc.run(16, 2, division);

        System.out.println("-------------JAVA 8 BiFunction--------------------");


        calc.run(16, 2, add_1);

        System.out.println("-------------JAVA 8 BiConsumer--------------------");

        Consumer<String> en_name = a -> System.out.println("Hello " + a);
        Consumer<String> pl_name = a -> System.out.println("Cześć " + a);
        calc.greet("Hose", pl_name);
        calc.greet("Hose", en_name);





/*        MathOperation e = new MathOperation() {
            @Override
            public int operation(int i, int k) {
                return 0;
            }
        }*/
    }

    private void run(int val1, int val2, BiFunction<Integer, Integer, Integer> operation) {
        int result = operation.apply(val1, val2);
        System.out.println("Result: " + result);
    }

    private void run(int val1, int val2, MathOperation operation) {
        int result = operation.operation(val1, val2);
        System.out.println("Result: " + result);
    }

    private void greet(String name, Consumer<String> lang) {
        lang.accept(name);
    }
}

@FunctionalInterface
interface MathOperation {
    int operation(int i, int k);
}

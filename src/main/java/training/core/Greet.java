package training.core;

interface Greet {
    void sayHello();

    void greeting(String name);

    default void greet(){
        System.out.println("Welcome");
    }
}

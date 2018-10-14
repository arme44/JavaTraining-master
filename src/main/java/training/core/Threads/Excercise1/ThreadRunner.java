package training.core.Threads.Excercise1;

public class ThreadRunner {

    public static void main(String[] args) {
        MyRunnable myR = new MyRunnable();

        Thread t_m = new Thread(myR);
        t_m.start(); // najpierw wypisuje liczby a poźniej po upływie 500ms z 2 klasy napis - powoduje nowy wątek
        //myR.run(); // najpierw był komunikat z 2 klasy a pozniej licznie nie powoduje nowego wątku

        for (int i = 0; i < 1_000; i++) {
            System.out.println(i);
        }
    }
}

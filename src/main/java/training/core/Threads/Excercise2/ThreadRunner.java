package training.core.Threads.Excercise2;

public class ThreadRunner {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        System.out.println(counter.getCount());
        ThreadPlus threadPlus = new ThreadPlus(counter);
        ThreadMinus threadMinus = new ThreadMinus(counter);
        threadMinus.start();
        threadPlus.start();

        threadMinus.join(500);
        threadPlus.join(500);
        System.out.println(counter.getCount());

    }
}

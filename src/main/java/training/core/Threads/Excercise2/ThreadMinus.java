package training.core.Threads.Excercise2;

public class ThreadMinus extends Thread {
    private  Counter counter;


    public ThreadMinus (Counter counter){

        this.counter = counter;
    }

    @Override
    public void run() {
        for (int it = 0; it < 10; it++) {
            counter.decrease();
            try {
                sleep(200);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Minus - done!");
    }
}
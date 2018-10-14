package training.core.Threads.Excercise3;

class CustomThreadInner extends Thread {


    @Override
    public void run() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName());
            System.out.println("I'm working really hard, ohh!!!");
        }
    }
}
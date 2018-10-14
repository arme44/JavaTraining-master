package training.core.Threads;

public class ThreadExample {

    public static void main(String[] args) {


        new Thread(new Runnable() {
            @Override
            public void run() {
                displayNumbers(100);

            }
        }).start();

        new Thread(() -> displayNumbers(25), "Goooo!").start();

        displayNumbers(50);
    }


    private static void displayNumbers(int sleep) {
        for (int i = 0; i < 500; i++) {
            String name = Thread.currentThread().getName();
            System.out.println(name + " : " + i);
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}



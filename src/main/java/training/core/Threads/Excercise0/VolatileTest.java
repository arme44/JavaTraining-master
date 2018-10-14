package training.core.Threads.Excercise0;

import java.util.logging.Level;
import java.util.logging.Logger;

public class VolatileTest {

    private static final Logger LOGGER = Logger.getLogger(VolatileTest.class.getName());

    private static volatile int MY_INT = 10;

    public static void main(String[] args) {
        new ChangeListener().start();
        new ChangeMaker().start();
    }

    static class ChangeListener extends Thread{

        @Override
        public void run() {
            int local_value = MY_INT;
            while (local_value<20) {
                if(local_value != MY_INT) {
                    local_value = MY_INT;
                    LOGGER.log(Level.INFO, "***Change for MY_INT: {0}", MY_INT);
                }
            }
        }
    }

    static  class ChangeMaker extends  Thread {

        @Override
        public void run() {
            int local_value = MY_INT;
            while (local_value<20) {
                LOGGER.log(Level.INFO, "###Change to {0}", local_value+1);
                MY_INT= ++local_value;
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

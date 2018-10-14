package training.core.Threads.Excercise2;

class Counter {

    private int count;

     //private Object lock1; zależne od sibie działające na tych samych wartościach dajemy lock1 i lock1
     //private Object lock2; niezależne od siebie działania aby ich nie blokować

    private Object lock1 = new Object();


    void increase() {
        synchronized (lock1) { // ze słwkiem this synchrnizuje się na klasie, synchronized przed void będzie synchroizował na metodzie
            count++;
        }
    }


    void decrease() {
        synchronized (lock1) {
            count--;
        }
    }

    int getCount() {
        return count;
    }
}

package training.core.controlStatements;

class for_Statement {

    public static void main(String[] args) {
        printFirst10Numbers();
        print10NumberFrom(44);
        print5NumbersLessThan(8);
        printEvenNumbersInRange(17, 33);
        printEveryNthNumberInRange(1, 44, 6);
    }

    private static void printEveryNthNumberInRange(
            int start, int end, int N_th)
    {
        for (int it = start; it <= end; it += N_th  /*it = it + N_th*/) {
            System.out.println("N-th: " + it);
        }
    }

    private static void printEvenNumbersInRange(int start, int end) {
        for (int it = start; it <= end; it++) {
            if (it % 2 != 0) {
                continue;
            }
            System.out.println("P: " + it);
        }
    }

    private static void print5NumbersLessThan(int number) {
        int end = number - 5;
        int it = number - 1;

        for (; ; ) {
            System.out.println("T: " + it);
            it--;// it = it - 1; // it-=1
            if (it < end) {
                break;
            }
        }
    }

    private static void print10NumberFrom(int start) {
        for (int it = start; it <= start + 10; it++) {
            System.out.println("C: " + it);
        }
    }

    private static void printFirst10Numbers() {
        for (int it = 1; it <= 10; it++) {
            System.out.println("N: " + it);
        }
    }
}

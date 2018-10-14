package training.core.controlStatements;

class doWhile_Statement {

    public static void main(String[] args) {

        exampleWithStopNow(false);

    }

    private static void exampleWithStopNow(boolean isRun) {
        do {
            System.out.println("I'm running");
        } while (isRun);
    }

}

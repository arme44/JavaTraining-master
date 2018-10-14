package training.core.controlStatements;

class if_Statement {
    private static final int ADULT_AGE = 18;

    public static void main(String[] args) {
        simpleAgeTest();
        simpleAgeTest(11);
        schoolLevelPupilTest(26);
        schoolLevelPupilTest(3);
        schoolLevelPupilTest(12);

        calculateDiscount(201.99);
        calculateDiscount(11.39);
        calculateDiscount(251.99);
    }

    private static void calculateDiscount(double valueOfCart) {
        if (valueOfCart > 250.0) {
            valueOfCart = valueOfCart * 0.9;
        } else if (valueOfCart > 150.0) {
            valueOfCart = valueOfCart * 0.95;
        }

        System.out.printf("Your payment is: %10.2f $\n", valueOfCart);
    }

    private static void schoolLevelPupilTest(int age) {
        if (age < 3) {
            System.out.println("Too young. Stay at home.");
        } else if (age < 7) {
            System.out.println("Kindergarten participant.");
        } else if (age < 14) {
            System.out.println("Primary school.");
        } else if (age < 17) {
            System.out.println("Secondary school.");
        } else if (age < 21) {
            System.out.println("High school.");
        } else if (age <= 26) {
            System.out.println("College.");
            if (age == 26) System.out.println("It's too long, isn't?");
        } else {
            System.out.println("Better to find a job.");
        }
    }

    private static void simpleAgeTest() {
        int respondentAge = 18;

        if (respondentAge >= ADULT_AGE) {
            System.out.println("Zakwalifikowany / pełnoletni");
        } else {
            System.out.println("Odmowa");
        }
    }

    private static void simpleAgeTest(int age) {
        System.out.println(
                (age < ADULT_AGE) ? "Young" : "Adult"
        );
    }
}

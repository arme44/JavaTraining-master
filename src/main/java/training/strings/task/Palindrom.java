package training.strings.task;

class Palindrom {

    public static void main(String[] args) {
        String slowo = "kAjak";
        String zdanie = "górka jak róg";

        testWord(slowo);
        testSentance(zdanie);
        manualWorkWithPalindromTest(zdanie);
    }

    private static void manualWorkWithPalindromTest(String sentance) {
        /**
         * PALINDROM tylko 'if' oraz 'for'
         *
         * Z wykorzystaniem tylko dwóch instrukcji serujących należy sprawdzić czy słowo
         * lub zdanie jest palindromem. Nie można korzystać z StringBuilder ani StringBuffer.
         * Występowanie znaków spacja w zdaniu należy obsłużyć samodzielnie.
         */
        System.out.println("------------------------------------------------------------------------");
        String copy = sentance.toUpperCase();
        int start = 0;
        int end = copy.length() - 1;
        final Character SPACE = ' ';
        boolean isPalindrom = true;

        for (; ; ) {
            Character front = copy.charAt(start);
            Character back = copy.charAt(end);

            if (front.equals(SPACE)) {
                start++;
                continue;
            }

            if (back.equals(SPACE)) {
                end--;
                continue;
            }

            isPalindrom = front.equals(back);
            boolean isEnd = (start == end);

            if (!isPalindrom) {
                System.out.println("Niestey nie");
                break;
            }

            if (isEnd) {
                System.out.println("Jest, super");
                break;
            }
            start++;
            end--;
        }

    }

    private static void testSentance(String zdanie) {
        String revers;
        revers = new StringBuffer(zdanie).reverse().toString();
        revers = revers.replaceAll(" ", "");

        System.out.println("Czy jest zdanie \"" + zdanie + "\" palindromem?");
        zdanie = zdanie.replaceAll(" ", "");

        System.out.println(zdanie.equalsIgnoreCase(revers));
    }

    private static void testWord(String slowo) {
        System.out.println("Czy jest słowo \"" + slowo + "\" palindromem?");
        String revers = new StringBuffer(slowo).reverse().toString();
        System.out.println(slowo.equalsIgnoreCase(revers));
    }


}
/**
 * Doddatkowe zdanie do badania na palindromy
 * karaiba wabi arak
 * a Noe leje Leona
 * Ada bąki piką bada
 * gąska jak sąg
 * górka jak róg
 */

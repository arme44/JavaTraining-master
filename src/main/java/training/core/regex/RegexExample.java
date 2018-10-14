package training.core.regex;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

    private static String regex;
    private static String input;

    public static void main(String[] args) {
        simpleregexMatch();
        excatlyOneWord();
        testSentenceWithoutNumbers();
        passwordtest();
        replaceWorldInSentence();
        removeSpaces();


    }

    private static void removeSpaces() {

        input = "Ala    ma      kota    .";
        System.out.println(input);
        regex= "\\s\\s+"; // regex= " +"; equal to on the left side
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        String newSent = matcher.replaceAll(" ");
        System.out.println(newSent);
        bar();

    }

    private static void replaceWorldInSentence() {

        input = "cats are very nice until don't meet other cat";
        regex = "cat";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        String newSent = matcher.replaceFirst("dog");
        System.out.println(newSent);
        bar();
    }

    private static void passwordtest() {

        input = "GGaaa12$";
        regex = "[a-zA-Z_0-9!@#]";
        System.out.println("Times : " + runTest(regex, input));
        bar();
    }

    private static void testSentenceWithoutNumbers() {

        input = "Ola ma trzy koty i dwa psy";
        regex = "\\d"; //  \\d sprawdzamy czy jest liczba , \\D sprawdzamy czy nie liczba
        System.out.println("Is present number: " + (runTest(regex,input) > 0)
        );
    }

    private static void excatlyOneWord() {

        regex = "\\W+Ola\\W+"; // Dokładnie tak samo \\W+ inny znak niż litea
        input = "Kola ma k.ola.nka a Ola nie";
        System.out.println("Times : " + runTest(regex, input));
        bar();
    }

    private static void simpleregexMatch() {
        regex = "ala";
        input = "Ala ma kota kala";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        System.out.println("is there: " + matcher.find());
        System.out.println("times " + runTest(regex, input));
        bar();

    }

    private static int runTest(String reg, String text) {
        int matches = 0;

        Pattern pattern = Pattern.compile(reg,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            matches++;
        }

        return matches;

    }

    private static void bar() {

        System.out.println("--------------------------------------------------");
    }
}

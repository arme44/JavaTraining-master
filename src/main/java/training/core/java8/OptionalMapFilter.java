package training.core.java8;

import org.junit.Test;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertTrue;

public class OptionalMapFilter {


    @Test
    public void passwordFillRequarments() {

        String pass = " TrustNo1";
        Optional<String> optPass = Optional.of(pass);
        Integer len = optPass.map(String::length) //s -> s.length()
                .orElse(0);
        assertTrue("Too short",len >=8);

        boolean correct = optPass
                .filter(p -> test(p, "[A-Z]"))
                .filter(p -> test(p, "[0-9]"))
                .isPresent();
        assertTrue("Brak symboli",correct);
    }

    public static boolean test(String p, String reg) {

        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(p);
        return matcher.find();
    }
}

package training.core.java8;

import org.junit.Test;


import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OptionalTest {

    @Test

    public void emptyOptionalIsOk() {
        Optional<String> empty = Optional.empty();
        assertFalse(empty.isPresent());
    }


    @Test

    public void stringOptionalIsOk() {
        Optional<String> empty = Optional.of("Java");
        assertTrue(empty.isPresent());
    }

    @Test

    public void stringOptionalReturnIsOk() {
        String input = "Java";
        Optional<String> val = Optional.of(input);
        String expected = String.format("Optional[%s]", input);
        assertEquals(expected, val.toString());
    }

    @Test (expected = NullPointerException.class)
    public void nullToOptionalIsNotOk() {
        Optional<String> empty = Optional.of(null);
        assertFalse(empty.isPresent());
    }



    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void arrayBeyondIsNotOk() {
        int[] tab = {1,3,5,6};
        int val = tab[-1]; // tab[100] but not tab[0]
    }

    @Test
    public void nullToOptionalIsOk() {
        Optional<String> empty = Optional.ofNullable(null);
        assertFalse(empty.isPresent());
    }

    @Test
    public void stringOptionalIsOkAndMightProcced() {
        String word = "Java";
        if (word != null) {
            System.out.println(word.length());
        }
        Optional<String> WORD = Optional.of(word);
        if(WORD.isPresent()) {
            System.out.println(WORD.get().length());
        }

        WORD.ifPresent(s -> System.out.println(s.length()));

    }


    @Test
    public void nullToOptionalIsOkWithElseOption() {
        String name = null;
        String person = Optional.ofNullable(name)
                .orElse("NN");
        assertEquals("NN", person);
    }


    @Test (expected = IllegalArgumentException.class)
    public void nullToOptionalIsOkOrThrowExcetion() {
        String name = null;
        String person = Optional.ofNullable(name)
                .orElseThrow(IllegalArgumentException::new);
        assertEquals("NN", person);
    }

    @Test
    public void nullToOptionalIsOkWithElseGetOption() {
        String name = null;
        String person = Optional.ofNullable(name)
                .orElseGet(()->"NN");
        assertEquals("NN", person);
    }


}

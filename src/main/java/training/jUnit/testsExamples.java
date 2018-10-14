package training.jUnit;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class testsExamples {

    @Test
    public void wordIsNotEmpty() {

        String word = "Ala";

        Assert.assertFalse(word.isEmpty());
    }

    @Test
    public void wordIsEqualToSelfUppercase() {

        String input = "Ala";
        String expected = "ALA";

        Assert.assertEquals(expected, input.toUpperCase());
    }

    @Test
    public void listContainsParticularWord_isMinLengthOf3() {
        List<String> list = Arrays.asList("Jan", "Tom", "John", "Rob", "Ala");
        assertTrue(list.size()>2);
        assertTrue("List without Ala",list.contains("Ala"));
    }

}

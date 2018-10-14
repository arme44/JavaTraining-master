package training.core.java8;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class OptionalElseExample {

    public String defaultValue(){
        System.out.println("Calculate default value ....");
        return "Default";
    }

    @Test
    public void getDefaultTextIsNull() {
        String text = null;

        System.out.println("OrElse");
        String exp_1 = Optional.ofNullable(text).orElse(defaultValue());
        assertEquals("Default", exp_1);
        System.out.println("OrElse");
        String exp_2 = Optional.ofNullable(text).orElseGet(this::defaultValue);
        assertEquals("Default", exp_2);
    }

    @Test
    public void getDefaultTextIsNotNull() {
        String text = "Info";

        System.out.println("OrElse");
        String exp_1 = Optional.ofNullable(text).orElse(defaultValue());
        assertEquals(text, exp_1);
        System.out.println("OrElse");
        String exp_2 = Optional.ofNullable(text).orElseGet(this::defaultValue);
        assertEquals(text, exp_2);
    }





}

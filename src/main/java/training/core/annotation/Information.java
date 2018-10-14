package training.core.annotation;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({
        ElementType.TYPE,
        ElementType.METHOD,
        ElementType.FIELD,
        ElementType.CONSTRUCTOR
})

@Documented
public @interface Information {

    String author() default "John Snow";
    String date();
    String description();
}

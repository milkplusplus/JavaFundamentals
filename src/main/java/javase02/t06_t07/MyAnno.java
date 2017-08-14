package javase02.t06_t07;


import java.lang.annotation.*;

@SuppressWarnings("unused")
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {

    String value() default "Arthur Dent";
}

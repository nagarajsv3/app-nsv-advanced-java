package com.nsv.jsmbaba.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD,ElementType.TYPE,ElementType.FIELD})
@Inherited
@Documented
public @interface MyAnnotation {
    public String author() default "Author Name Naga";
    public String description() default "MyAnnotation Description";
    public String value() default "MyAnnotation";
}

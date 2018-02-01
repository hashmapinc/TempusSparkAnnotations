package com.hashmap.tempus.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SparkRequest {
    String[] args();
    String main();
    String jar();
    String descriptor();
    String name();
}

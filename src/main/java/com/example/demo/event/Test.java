package com.example.demo.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.scan("com.example.demo.event");
        applicationContext.refresh();
        applicationContext.publishEvent(new LogEvent("zs"));
    }
}

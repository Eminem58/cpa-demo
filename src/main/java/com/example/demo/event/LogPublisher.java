package com.example.demo.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 日志触发器，通知观察者
 */
public class LogPublisher implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    public static void publishEvent(String name) {
        applicationContext.publishEvent(new LogEvent(name));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}

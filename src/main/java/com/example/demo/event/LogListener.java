package com.example.demo.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 日志监听，观察者
 */
@Component
public class LogListener implements ApplicationListener<LogEvent> {

    @Override
    public void onApplicationEvent(LogEvent logEvent) {
        System.out.println("监听到了，犯人"+logEvent.getSource()+"逃跑了。。。");
    }
}

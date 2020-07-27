package com.example.demo.event;

import org.springframework.context.ApplicationEvent;

/**
 * 日志事件，观察目标
 */

public class LogEvent extends ApplicationEvent {

    public LogEvent(Object source) {
        super(source);
    }
}

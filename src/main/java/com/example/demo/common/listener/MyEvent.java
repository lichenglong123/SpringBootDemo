package com.example.demo.common.listener;

import org.springframework.context.ApplicationEvent;

/**
 * @author Jack
 * @description: TODO
 * @date 2019/8/30 14:55
 */
public class MyEvent extends ApplicationEvent {
    public MyEvent(Object source) {
        super(source);
    }
}

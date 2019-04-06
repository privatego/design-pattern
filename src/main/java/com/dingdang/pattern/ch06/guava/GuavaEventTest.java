package com.dingdang.pattern.ch06.guava;

import com.google.common.eventbus.EventBus;

/**
 * @author: blessed
 * @Date: 2019/4/6
 */
public class GuavaEventTest {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("Tom");
    }
}

package com.dingdang.pattern.ch06.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @author: blessed
 * @Date: 2019/4/6
 */
public class GuavaEvent {

    @Subscribe
    public void subscribe(String str){
        System.out.println("执行subscribe方法，传入的参数是："+ str);
    }
}

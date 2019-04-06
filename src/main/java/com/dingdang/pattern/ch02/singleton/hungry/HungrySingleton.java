package com.dingdang.pattern.ch02.singleton.hungry;

/**
 * @author: blessed
 * @Date: 2019/4/6
 */
public class HungrySingleton {
    //
    private static final HungrySingleton singleton = new HungrySingleton();

    public HungrySingleton() {
    }
    public static HungrySingleton getInstance(){
        return singleton;
    }
}

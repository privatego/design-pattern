package com.dingdang.pattern.ch02.singleton.lazy;

/**
 * @author: blessed
 * @Date: 2019/4/6
 */
public class ExecutorThread implements Runnable {
    @Override
    public void run() {
        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" +singleton);
    }
}

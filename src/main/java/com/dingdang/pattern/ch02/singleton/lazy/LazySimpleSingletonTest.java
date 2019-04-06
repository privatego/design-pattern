package com.dingdang.pattern.ch02.singleton.lazy;

/**
 * @author: blessed
 * @Date: 2019/4/6
 */
public class LazySimpleSingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());
        t1.start();
        t2.start();
        System.out.println("End");
    }
}

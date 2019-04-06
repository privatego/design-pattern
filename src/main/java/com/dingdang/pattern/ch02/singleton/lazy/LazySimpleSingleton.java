package com.dingdang.pattern.ch02.singleton.lazy;

/**
 * @author: blessed
 * @Date: 2019/4/6
 */
public class LazySimpleSingleton {
    private static LazySimpleSingleton lazy = null;

    private LazySimpleSingleton() {
    }

    public static LazySimpleSingleton getInstance(){
        if (lazy == null){
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }

    // 加锁
//    public synchronized static LazySimpleSingleton getInstance(){
//        if (lazy == null){
//            lazy = new LazySimpleSingleton();
//        }
//        return lazy;
//    }

}

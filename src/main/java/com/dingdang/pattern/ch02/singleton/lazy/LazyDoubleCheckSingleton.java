package com.dingdang.pattern.ch02.singleton.lazy;

/**
 * @author: blessed
 * @Date: 2019/4/6
 */
public class LazyDoubleCheckSingleton {
    private static LazyDoubleCheckSingleton lazy = null;

    private LazyDoubleCheckSingleton() {
    }

    /**
     * 双重检查锁
     * @return
     */
    public static LazyDoubleCheckSingleton getInstance(){
        if (lazy == null){
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazy == null) {
                    lazy = new LazyDoubleCheckSingleton();
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.设置lazy指向刚分配的内存地址
                }
            }
        }
        return lazy;
    }

}

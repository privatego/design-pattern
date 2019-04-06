package com.dingdang.pattern.ch02.singleton.lazy;

/**
 * 这种形式兼顾了饿汉式的内存浪费，也兼顾synchronized性能问题
 * 完美地屏蔽了这两个缺点
 *
 * @author: blessed
 * @Date: 2019/4/6
 */
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton(){
        if (LazyHolder.LAZY != null){
            throw new RuntimeException("不允许创建多个实例！");
        }

    }

    /**
     * static 是为了使单例的空间共享
     * final 保证这个方法不会被重写，重载
     * @return
     */
    public static final LazyInnerClassSingleton getInstance(){
        // 在返回结果前，一定会先加载内部类
        return LazyHolder.LAZY;
    }

    //默认不加载
    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}

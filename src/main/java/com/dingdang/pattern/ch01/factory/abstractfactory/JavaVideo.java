package com.dingdang.pattern.ch01.factory.abstractfactory;

/**
 * @author: blessed
 * @Date: 2019/3/12
 */
public class JavaVideo implements IVideo {
    @Override
    public void play(String name) {
        System.out.println("我在看java的视频："+name);
    }
}

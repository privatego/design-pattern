package com.dingdang.pattern.ch01.factory.abstractfactory;

/**
 * @author: blessed
 * @Date: 2019/3/12
 */
public class PythonVideo implements IVideo {
    @Override
    public void play(String name) {
        System.out.println("我在看python的视频："+name);
    }
}

package com.dingdang.pattern.ch01.factory.abstractfactory;

/**
 * @author: blessed
 * @Date: 2019/3/12
 */
public class PythonNote implements INote {
    @Override
    public void write(String content) {
        System.out.println("我在写python的笔记："+content);
    }
}

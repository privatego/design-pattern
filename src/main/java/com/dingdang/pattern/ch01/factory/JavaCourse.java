package com.dingdang.pattern.ch01.factory;

/**
 * @author: blessed
 * @Date: 2019/3/12
 */
public class JavaCourse implements ICourse{
    @Override
    public void record() {
        System.out.println("java 课程");
    }
}

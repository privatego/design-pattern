package com.dingdang.pattern.ch01.factory;

/**
 * @author: blessed
 * @Date: 2019/3/12
 */
public class PythonCourse implements ICourse{
    @Override
    public void record() {
        System.out.println("python 课程");
    }
}

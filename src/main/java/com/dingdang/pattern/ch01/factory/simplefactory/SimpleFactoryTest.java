package com.dingdang.pattern.ch01.factory.simplefactory;


import com.dingdang.pattern.ch01.factory.JavaCourse;

/**
 * @author: blessed
 * @Date: 2019/3/12
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleCourseFactory factory = new SimpleCourseFactory();
        factory.create("java").record();
        factory.createByReflect("com.dingdang.pattern.ch01.factory.PythonCourse").record();
        factory.create(JavaCourse.class).record();
    }
}

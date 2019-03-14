package com.dingdang.pattern.ch01.factory.abstractfactory;

/**
 * @author: blessed
 * @Date: 2019/3/14
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        factory.createCourse().record();
        factory.createNote().write("这个是Java");
        factory.createVideo().play("这个是Java");
    }
}

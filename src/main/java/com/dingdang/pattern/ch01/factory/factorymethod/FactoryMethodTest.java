package com.dingdang.pattern.ch01.factory.factorymethod;

/**
 * @author: blessed
 * @Date: 2019/3/12
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory factory = new PythonCourseFactory();
        factory.create().record();
    }
}

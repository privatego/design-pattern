package com.dingdang.pattern.ch05.template;

/**
 * @author: blessed
 * @Date: 2019/3/25
 */
public class JavaCourse extends NetworkCourse {
    @Override
    protected boolean needHomework() {
        return true;
    }

    @Override
    protected void checkHomework() {
        System.out.println("检查JAVA作业");
    }
}

package com.dingdang.pattern.ch01.factory.abstractfactory;

import com.dingdang.pattern.ch01.factory.ICourse;
import com.dingdang.pattern.ch01.factory.JavaCourse;

/**
 * @author: blessed
 * @Date: 2019/3/12
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }

    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}

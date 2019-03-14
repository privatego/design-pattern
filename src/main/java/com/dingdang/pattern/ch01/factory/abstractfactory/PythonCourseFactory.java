package com.dingdang.pattern.ch01.factory.abstractfactory;

import com.dingdang.pattern.ch01.factory.ICourse;
import com.dingdang.pattern.ch01.factory.PythonCourse;

/**
 * @author: blessed
 * @Date: 2019/3/14
 */
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new PythonCourse();
    }

    @Override
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }
}

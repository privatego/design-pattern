package com.dingdang.pattern.ch01.factory.factorymethod;

import com.dingdang.pattern.ch01.factory.ICourse;
import com.dingdang.pattern.ch01.factory.PythonCourse;

/**
 * @author: blessed
 * @Date: 2019/3/12
 */
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}

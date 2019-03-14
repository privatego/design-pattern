package com.dingdang.pattern.ch01.factory.factorymethod;

import com.dingdang.pattern.ch01.factory.ICourse;

/**
 * @author: blessed
 * @Date: 2019/3/12
 */
public interface ICourseFactory {
    public ICourse create();
}

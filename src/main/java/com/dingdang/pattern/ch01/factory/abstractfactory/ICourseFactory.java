package com.dingdang.pattern.ch01.factory.abstractfactory;

import com.dingdang.pattern.ch01.factory.ICourse;

/**
 * @author: blessed
 * @Date: 2019/3/12
 * 要求所有的子工厂都必须实现这个工厂
 * （一个品牌的抽象）
 */
public interface ICourseFactory {
    ICourse createCourse();
    INote createNote();
    IVideo createVideo();
}

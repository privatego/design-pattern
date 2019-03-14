package com.dingdang.pattern.ch01.factory.simplefactory;

import com.dingdang.pattern.ch01.factory.ICourse;
import com.dingdang.pattern.ch01.factory.JavaCourse;
import com.dingdang.pattern.ch01.factory.PythonCourse;
import org.apache.commons.lang3.StringUtils;

/**
 * @author: blessed
 * @Date: 2019/3/13
 */
public class SimpleCourseFactory {
    public ICourse create(String type){
        if ("java".equals(type)){
            return new JavaCourse();
        }else if ("python".equals(type)){
            return new PythonCourse();
        }
        return null;
    }

    public ICourse createByReflect(String clzName){
        if (StringUtils.isNotEmpty(clzName)){
            try {
                return (ICourse) Class.forName(clzName).newInstance();
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public ICourse create(Class<? extends ICourse> clazz){
        if (null != clazz){
            try {
                return clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}

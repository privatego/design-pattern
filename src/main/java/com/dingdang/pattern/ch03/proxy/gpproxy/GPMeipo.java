package com.dingdang.pattern.ch03.proxy.gpproxy;

import com.dingdang.pattern.ch03.proxy.Person;

import java.lang.reflect.Method;


/**
 * @author: blessed
 * @Date: 2019/3/10
 */
public class GPMeipo implements GPInvocationHandler {
    //持有目标对象的引用
    private Object target;

    public Object getInstance(Object person)throws Exception{
        this.target = person;
        Class<?> clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object object = method.invoke(this.target, args);
        after();
        return object;
    }

    private void before(){
        System.out.println("功能增强-前");
    }

    private void after(){
        System.out.println("功能增强-后");
    }


}

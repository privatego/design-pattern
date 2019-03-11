package com.dingdang.pattern.ch03.proxy.jdkproxy;

import com.dingdang.pattern.ch03.proxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: blessed
 * @Date: 2019/3/10
 */
public class Meipo implements InvocationHandler {
    private Person target;

    public Object getInstance(Person person)throws Exception{
        this.target = person;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this::invoke);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object object = method.invoke(this.target, args);
        after();
        return object;
    }

    private void before(){
        System.out.println("功能增强");
    }

    private void after(){
        System.out.println("功能增强");
    }


}

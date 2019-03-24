package com.dingdang.pattern.ch03.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: blessed
 * @Date: 2019/3/18
 */
public class CGLibMeipo implements MethodInterceptor {

    public Object getInstance(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        //要把哪个设置为即将生成的新类父类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object obj = methodProxy.invokeSuper(o, objects);
        after();
        return obj;
    }


    private void before() {
        System.out.println("功能增强--前");
    }


    private void after() {
        System.out.println("功能增强--后");
    }
}

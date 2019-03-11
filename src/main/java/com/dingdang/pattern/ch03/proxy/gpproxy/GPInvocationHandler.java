package com.dingdang.pattern.ch03.proxy.gpproxy;

import java.lang.reflect.Method;

/**
 * @author: blessed
 * @Date: 2019/3/10
 */
public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}

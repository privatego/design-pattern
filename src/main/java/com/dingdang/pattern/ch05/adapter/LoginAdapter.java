package com.dingdang.pattern.ch05.adapter;

/**
 * @author: blessed
 * @Date: 2019/4/5
 */
public interface LoginAdapter {
    boolean support(Object adapter);

    ResultMsg login(String id, Object adapter);
}

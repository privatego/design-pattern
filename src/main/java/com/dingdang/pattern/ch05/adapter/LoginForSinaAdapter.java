package com.dingdang.pattern.ch05.adapter;

/**
 * @author: blessed
 * @Date: 2019/4/5
 */
public class LoginForSinaAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForSinaAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}

package com.dingdang.pattern.ch05.adapter;

/**
 * @author: blessed
 * @Date: 2019/4/5
 */
public class LoginForQQAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        ResultMsg rm = new ResultMsg();
        rm.setCode(0);
        rm.setMsg("qq 登录成功！");
        return rm;
    }
}

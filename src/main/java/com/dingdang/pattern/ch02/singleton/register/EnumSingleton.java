package com.dingdang.pattern.ch02.singleton.register;

/**
 * @author: blessed
 * @Date: 2019/4/6
 */
public enum  EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}

package com.dingdang.pattern.ch06.decorator.v2;

/**
 * @author: blessed
 * @Date: 2019/4/5
 */
public class BaseBatterCake extends BatterCake {
    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}

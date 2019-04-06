package com.dingdang.pattern.ch06.decorator;

/**
 * @author: blessed
 * @Date: 2019/4/5
 */
public class BatterCakeWithEgg extends BatterCake {
    @Override
    protected String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}

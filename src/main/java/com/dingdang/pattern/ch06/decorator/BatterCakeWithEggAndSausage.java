package com.dingdang.pattern.ch06.decorator;

/**
 * @author: blessed
 * @Date: 2019/4/5
 */
public class BatterCakeWithEggAndSausage extends BatterCakeWithEgg {
    @Override
    protected String getMsg() {
        return super.getMsg() + "+1根香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}

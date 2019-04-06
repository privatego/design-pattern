package com.dingdang.pattern.ch06.decorator.v2;

/**
 * @author: blessed
 * @Date: 2019/4/5
 */
public abstract class BatterCakeDecorator extends BatterCake {
    //静态代理，委派
    private BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    protected abstract void doSomething();

    @Override
    protected String getMsg() {
        return this.batterCake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.batterCake.getPrice();
    }
}

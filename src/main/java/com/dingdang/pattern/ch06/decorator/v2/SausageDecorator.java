package com.dingdang.pattern.ch06.decorator.v2;

/**
 * @author: blessed
 * @Date: 2019/4/5
 */
public class SausageDecorator extends BatterCakeDecorator {
    @Override
    protected void doSomething() {

    }

    public SausageDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"+1根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}

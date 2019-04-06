package com.dingdang.pattern.ch06.decorator.v2;

/**
 * @author: blessed
 * @Date: 2019/4/5
 */
public class EggDecorator extends BatterCakeDecorator {
    public EggDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    protected void doSomething(){

    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}

package com.dingdang.pattern.ch06.decorator.v2;

/**
 * @author: blessed
 * @Date: 2019/4/5
 */
public class BatterCakeTest {
    public static void main(String[] args) {
        BatterCake batterCake ;
        batterCake = new BaseBatterCake();
        System.out.println(batterCake.getMsg() + "，价格：" + batterCake.getPrice());
        batterCake = new EggDecorator(batterCake);
        System.out.println(batterCake.getMsg() + "，价格：" + batterCake.getPrice());
        batterCake = new EggDecorator(batterCake);
        System.out.println(batterCake.getMsg() + "，价格：" + batterCake.getPrice());
        batterCake = new SausageDecorator(batterCake);
        System.out.println(batterCake.getMsg() + "，价格：" + batterCake.getPrice());
        batterCake = new SausageDecorator(batterCake);
        System.out.println(batterCake.getMsg() + "，价格：" + batterCake.getPrice());


    }
}

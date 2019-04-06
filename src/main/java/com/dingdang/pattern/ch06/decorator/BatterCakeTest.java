package com.dingdang.pattern.ch06.decorator;

/**
 * @author: blessed
 * @Date: 2019/4/5
 */
public class BatterCakeTest {
    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getMsg() + ", 价格：" + batterCake.getPrice());

        BatterCake batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println(batterCakeWithEgg.getMsg() + "，价格：" + batterCakeWithEgg.getPrice());

        BatterCake batterCakeWithEggAndSausage = new BatterCakeWithEggAndSausage();
        System.out.println(batterCakeWithEggAndSausage.getMsg() + "，价格：" + batterCakeWithEggAndSausage.getPrice());
    }
}

package com.dingdang.pattern.ch04.strategy;

/**
 * @author: blessed
 * @Date: 2019/3/24
 */
public class CashbackStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促锁，返回的金额转到支付账号");
    }
}

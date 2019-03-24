package com.dingdang.pattern.ch04.strategy;

/**
 * @author: blessed
 * @Date: 2019/3/24
 */
public class EmptyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销活动！");
    }
}

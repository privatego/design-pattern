package com.dingdang.pattern.ch04.strategy;

/**
 * @author: blessed
 * @Date: 2019/3/24
 */
public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("优惠券已经领取，");
    }
}

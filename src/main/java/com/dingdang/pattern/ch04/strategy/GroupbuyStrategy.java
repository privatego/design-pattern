package com.dingdang.pattern.ch04.strategy;

/**
 * @author: blessed
 * @Date: 2019/3/24
 */
public class GroupbuyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("拼团啦，满20人享受团购价。");
    }
}

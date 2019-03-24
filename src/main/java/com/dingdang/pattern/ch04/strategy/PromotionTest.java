package com.dingdang.pattern.ch04.strategy;

/**
 * @author: blessed
 * @Date: 2019/3/24
 */
public class PromotionTest {
    public static void main(String[] args) {
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy("GROUPBUY"));
        promotionActivity.execute();
    }
}

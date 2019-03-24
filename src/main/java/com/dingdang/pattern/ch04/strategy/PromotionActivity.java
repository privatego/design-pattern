package com.dingdang.pattern.ch04.strategy;

/**
 * @author: blessed
 * @Date: 2019/3/24
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void execute(){
        promotionStrategy.doPromotion();
    }

}

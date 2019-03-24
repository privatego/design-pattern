package com.dingdang.pattern.ch04.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 促销策略工厂
 * @author: blessed
 * @Date: 2019/3/24
 */
public class PromotionStrategyFactory {

    private static final PromotionStrategy NON_PROMOTION = new EmptyStrategy();
    private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.COUPON, new CouponStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.CASHBACK, new CashbackStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.GROUPBUY, new GroupbuyStrategy());
    }

    private interface PromotionKey{
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String GROUPBUY = "GROUPBUY";
    }

    public static PromotionStrategy getPromotionStrategy(String promotionKey){
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
    }
}

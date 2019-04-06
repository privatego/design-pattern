package com.dingdang.pattern.ch05.adapter;

/**
 * @author: blessed
 * @Date: 2019/3/26
 */
public class AdapterTest {
    public static void main(String[] args) {
        ILoginForThird loginForThird = new LoginForThirdAdapter();
        ResultMsg rm = loginForThird.loginForQQ("blessed");
        System.out.println(rm.getMsg());

    }
}

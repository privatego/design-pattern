package com.dingdang.pattern.ch04.delegate;

/**
 * @author: blessed
 * @Date: 2019/3/21
 */
public class DelegateTest {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.command("架构", new Leader());
    }
}

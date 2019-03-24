package com.dingdang.pattern.ch03.proxy.jdkproxy;

import com.dingdang.pattern.ch03.proxy.Person;

/**
 * @author: blessed
 * @Date: 2019/3/10
 */
public class Gril implements Person {

    @Override
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("六块腹肌");
    }
}

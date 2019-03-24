package com.dingdang.pattern.ch03.proxy.staticproxy;

import com.dingdang.pattern.ch03.proxy.Son;

/**
 * @author: blessed
 * @Date: 2019/3/17
 */
public class Client {
    public static void main(String[] args) {

        Son son = new Son();
        //只能给儿子找对象
        Father father = new Father(son);
        father.findLove();
    }
}

package com.dingdang.pattern.ch02.prototype;

/**
 * @author: blessed
 * @Date: 2019/3/14
 */
public class Client {

    public Prototype startClone(Prototype prototype){
        return prototype.clone();
    }
}

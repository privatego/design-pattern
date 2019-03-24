package com.dingdang.pattern.ch04.delegate;

/**
 * @author: blessed
 * @Date: 2019/3/21
 */
public class Boss {

    void command(String command, Leader leader){
        leader.doing(command);
    }
}

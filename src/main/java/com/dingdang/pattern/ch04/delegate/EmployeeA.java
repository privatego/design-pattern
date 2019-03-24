package com.dingdang.pattern.ch04.delegate;

/**
 * @author: blessed
 * @Date: 2019/3/21
 */
public class EmployeeA implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工A，我现在开始干" + command + "工作。");
    }
}

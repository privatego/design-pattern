package com.dingdang.pattern.ch03.proxy.staticproxy;

import com.dingdang.pattern.ch03.proxy.Person;

/**
 * @author: blessed
 * @Date: 2019/3/17
 */
public class Father implements Person {
    private Person person;

    //没办法扩展
    public Father(Person person) {
        this.person = person;
    }


    @Override
    public void findLove() {
        System.out.println("父母开始物色对象");
        person.findLove();
        System.out.println("双方同意交往，确立恋爱关系");
    }
}

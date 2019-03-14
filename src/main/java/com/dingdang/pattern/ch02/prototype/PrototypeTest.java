package com.dingdang.pattern.ch02.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: blessed
 * @Date: 2019/3/14
 */
public class PrototypeTest {
    public static void main(String[] args) {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        concretePrototypeA.setName("tang");
        concretePrototypeA.setAge(18);
        List<String> hobbies = new ArrayList<>();
        hobbies.add("ball");
        concretePrototypeA.setHobbies(hobbies);
        Client client = new Client();
        ConcretePrototypeA copy = (ConcretePrototypeA) client.startClone(concretePrototypeA);
        System.out.println(copy);

    }
}

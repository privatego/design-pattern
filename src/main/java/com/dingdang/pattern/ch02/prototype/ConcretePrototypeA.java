package com.dingdang.pattern.ch02.prototype;

import java.util.List;

/**
 * 需要克隆的对象
 * @author: blessed
 * @Date: 2019/3/14
 */
public class ConcretePrototypeA implements Prototype {
    private String name;
    private int age;
    private List hobbies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    /**
     * 浅克隆
     * @return
     */
    @Override
    public Prototype clone() {
        ConcretePrototypeA copy = new ConcretePrototypeA();
        copy.setName(this.name);
        copy.setAge(this.age);
        copy.setHobbies(this.hobbies);//复制的不是值，而是引用的地址。
        return copy;
    }

    @Override
    public String toString() {
        return "ConcretePrototypeA{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies +
                '}';
    }
}

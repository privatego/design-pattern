package com.dingdang.pattern.ch06.observe;

import java.util.Observable;

/**
 * 被观察者
 * @author: blessed
 * @Date: 2019/4/6
 */
public class GPer extends Observable {
    private String name = "GPer生态圈";
    private static GPer gPer = null;

    public GPer() {}

    public static GPer getInstance(){
        if (null == gPer){
            gPer = new GPer();
        }
        return gPer;
    }

    public String getName() {
        return name;
    }

    public void publishQuestion(Question question){
        System.out.println(question.getUserName() + "在" + this.name + "提交了一个问题。");
        setChanged();
        notifyObservers(question);
    }
}

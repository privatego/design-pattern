package com.dingdang.pattern.ch06.observe;

/**
 * @author: blessed
 * @Date: 2019/4/6
 */
public class ObserverTest {
    public static void main(String[] args) {
        GPer gPer = GPer.getInstance();
        Teacher tom = new Teacher("tom");
        Teacher mic = new Teacher("mic");
        gPer.addObserver(tom);
        gPer.addObserver(mic);
        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者模式适用于哪些场景？");
        gPer.publishQuestion(question);

    }
}

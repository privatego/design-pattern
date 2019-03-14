package com.dingdang.pattern.ch02.prototype;

/**
 * @author: blessed
 * @Date: 2019/3/14
 */
public class DeepCloneTest {
    public static void main(String[] args) {
        QitiandaSheng qitiandaSheng = new QitiandaSheng();
        try {
            QitiandaSheng clone = (QitiandaSheng) qitiandaSheng.clone();

            System.out.println("深克隆："+(qitiandaSheng.jinGuBang == clone.jinGuBang));
        }catch (Exception e){
            e.printStackTrace();
        }

        QitiandaSheng q =new QitiandaSheng();
        QitiandaSheng n = q.shallowClone(qitiandaSheng);
        System.out.println("浅克隆："+(q.jinGuBang == n.jinGuBang));
    }
}

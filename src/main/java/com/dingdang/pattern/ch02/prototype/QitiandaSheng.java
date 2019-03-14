package com.dingdang.pattern.ch02.prototype;

import java.io.*;
import java.util.Date;

/**
 * @author: blessed
 * @Date: 2019/3/14
 */
public class QitiandaSheng extends Mokey implements Cloneable, Serializable {
    public JinGuBang jinGuBang;

    /**
     * 初始化
     */
    public QitiandaSheng() {
        this.jinGuBang = new JinGuBang();
        this.birthday = new Date();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    /**
     * 深克隆
     * @return
     */
    public Object deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            QitiandaSheng copy = (QitiandaSheng) ois.readObject();
            copy.birthday = new Date();
            return copy;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 浅克隆
     * @param target
     * @return
     */
    public QitiandaSheng shallowClone(QitiandaSheng target){
        QitiandaSheng qitiandaSheng = new QitiandaSheng();
        qitiandaSheng.height = target.height;
        qitiandaSheng.weight = target.weight;
        qitiandaSheng.jinGuBang = target.jinGuBang;
        qitiandaSheng.birthday = new Date();
        return qitiandaSheng;
    }
}

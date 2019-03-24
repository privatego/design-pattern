package com.dingdang.pattern.ch03.proxy.gpproxy;

import com.dingdang.pattern.ch03.proxy.Person;
import com.dingdang.pattern.ch03.proxy.jdkproxy.Gril;
import com.dingdang.pattern.ch03.proxy.jdkproxy.JDKMeipo;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @author: blessed
 * @Date: 2019/3/10
 */
public class GPProxyTest {
    public static void main(String[] args) {
        try {
            Person meipo = (Person) new GPMeipo().getInstance(new Gril());
            meipo.findLove();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

package com.dingdang.pattern.ch03.proxy.jdkproxy;

import com.dingdang.pattern.ch03.proxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @author: blessed
 * @Date: 2019/3/10
 */
public class JDKProxyTest {
    public static void main(String[] args) {
        try {
            Person meipo = (Person) new JDKMeipo().getInstance(new Gril());
            meipo.findLove();

            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("$Proxy0.class");
            os.write(bytes);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

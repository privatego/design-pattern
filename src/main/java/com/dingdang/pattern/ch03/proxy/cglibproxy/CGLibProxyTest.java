package com.dingdang.pattern.ch03.proxy.cglibproxy;

import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @author: blessed
 * @Date: 2019/3/18
 */
public class CGLibProxyTest {
    public static void main(String[] args) {
        String path = CGLibProxyTest.class.getResource("").toString();
        System.out.println(path);
        //利用CGLib的代理类可以将内存中的class文件写入本地磁盘
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/blessed/orchid/gp/2019/design-pattern/");

        Customer customer = (Customer) new CGLibMeipo().getInstance(Customer.class);
        customer.findLove();
    }
}

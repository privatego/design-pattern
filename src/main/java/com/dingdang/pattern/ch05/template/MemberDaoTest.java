package com.dingdang.pattern.ch05.template;

import java.util.List;

/**
 * @author: blessed
 * @Date: 2019/3/25
 */
public class MemberDaoTest {

    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
        System.out.println(result);
    }
}

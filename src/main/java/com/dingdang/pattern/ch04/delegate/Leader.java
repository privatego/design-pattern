package com.dingdang.pattern.ch04.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: blessed
 * @Date: 2019/3/21
 */
public class Leader {
    private Map<String, IEmployee> targets = new HashMap<>();

    public Leader() {
        targets.put("架构",new EmployeeA());
        targets.put("打杂",new EmployeeB());
    }

    void doing(String command){
        targets.get(command).doing(command);
    }
}

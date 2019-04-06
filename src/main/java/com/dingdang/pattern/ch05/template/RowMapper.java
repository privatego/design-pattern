package com.dingdang.pattern.ch05.template;

import java.sql.ResultSet;

/**
 * @author: blessed
 * @Date: 2019/3/25
 */
public interface RowMapper<T> {
    T mapRow(ResultSet rs, int rowNum)throws Exception;
}

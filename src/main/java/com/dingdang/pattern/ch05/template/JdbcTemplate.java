package com.dingdang.pattern.ch05.template;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: blessed
 * @Date: 2019/3/25
 */
public class JdbcTemplate {
    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<?> executeQuery(String sql, RowMapper<?> rowMapper, Object[] values){
        try {
            //1.获取连接
            Connection conn = this.geConnection();
            //2.创建语句集
            PreparedStatement pstm = this.createPreparedStatement(conn, sql);
            //3.执行语句集
            ResultSet rs = this.executeQuery(pstm, values);
            //4.处理结果集
            List<?> result = this.paresResultSet(rs, rowMapper);
            //5.关闭结果集
            this.closeResultSet(rs);
            //6.关闭语句集
            this.closeStatement(pstm);
            //7.关闭连接
            this.closeConnection(conn);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    private void closeResultSet(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void closeStatement(PreparedStatement pstm) {
        try {
            if (pstm != null) {
                pstm.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void closeConnection(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private List<?> paresResultSet(ResultSet rs, RowMapper<?> rowMapper) throws Exception {
        List<Object> result = new ArrayList<>();
        int rowNum = 1;
        while(rs.next()){
            result.add(rowMapper.mapRow(rs, rowNum++));
        }
        return result;
    }

    private ResultSet executeQuery(PreparedStatement pstm, Object[] values) throws SQLException {
        for (int i=0; i<values.length; i++){
            pstm.setObject(i, values[i]);
        }
        return pstm.executeQuery();
    }

    private PreparedStatement createPreparedStatement(Connection conn, String sql) throws SQLException {
        return conn.prepareStatement(sql);
    }

    private Connection geConnection() throws SQLException {
        return this.dataSource.getConnection();
    }
}

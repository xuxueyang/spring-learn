package com.mybatis.demo;

import org.springframework.jdbc.support.JdbcUtils;
import org.springframework.test.jdbc.JdbcTestUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo1 {
    public static void main(String[] args) throws SQLException {
        Connection con = null;
        PreparedStatement preparedStatement = null;
//        con = JdbcUtils.
//        con = JdbcTestUtils.
        preparedStatement.execute("sql");
        preparedStatement.setString(1,"value");
        preparedStatement.addBatch();
        preparedStatement.executeBatch();
        preparedStatement.clearBatch();

    }
}

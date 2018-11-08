package com.ioc.demo.JDBCTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
    private JdbcTemplate jdbcTemplate;
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("JDBCSpring.xml");
        jdbcTemplate = (JdbcTemplate)context.getBean("jdbcTemplate");
    }

    @org.junit.Test
    public void testExecute(){

//        jdbcTemplate.execute();
//        jdbcTemplate.update
        String sql = "insert into students(name,sex) value(?,?)";
        jdbcTemplate.update(sql,new Object[]{"1","main"});
    }
}

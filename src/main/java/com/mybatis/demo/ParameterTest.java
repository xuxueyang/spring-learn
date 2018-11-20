package com.mybatis.demo;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class ParameterTest {
    public static SqlSessionFactory sqlSessionFactory = null;
//    QueryRunner queryRunner = new  QueryR
    public static SqlSessionFactory getSqlSessionFactory(){
        if(sqlSessionFactory==null){
            String resource = "mybatis-config.xml";
            try {
                Reader reader = Resources.getResourceAsReader(resource);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return sqlSessionFactory;
    }
    public void deletePerson(){
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        PersonMapper personMapper  = sqlSession.getMapper(PersonMapper.class);
        personMapper.deletePerson(5);
        sqlSession.commit();
    }
}

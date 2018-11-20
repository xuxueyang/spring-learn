package com.mybatis.demo;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonMapper {
    public void deletePerson(Integer id);
    public int addPersons( @Param("persons") List<Object> persons);
}

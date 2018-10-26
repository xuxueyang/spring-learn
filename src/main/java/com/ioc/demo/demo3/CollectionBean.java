package com.ioc.demo.demo3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class CollectionBean {
    private List<String> list;
    private Properties properties;
    private Array[] arrays;
    private Map<String,Integer> map;

    @Override
    public String toString() {
        return "CollectionBean{" +
                "list=" + list +
                ", properties=" + properties +
                ", arrays=" + Arrays.toString(arrays) +
                ", map=" + map +
                '}';
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Array[] getArrays() {
        return arrays;
    }

    public void setArrays(Array[] arrays) {
        this.arrays = arrays;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }
}

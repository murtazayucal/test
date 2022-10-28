package com.murtazayucal.chapter3;

import java.util.HashMap;

public enum EnumCache implements  Cache{
    INSTANCE;

    HashMap<Object,Object> map =  new HashMap<Object,Object>();


    public void put(Object key, Object value) {
        map =  new HashMap<Object,Object>();
    }


    public Object get(Object key) {
        return map.get(key);
    }
}

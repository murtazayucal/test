package com.murtazayucal.chapter3;

import java.util.HashMap;

public class EagerCache implements Cache {


    private static EagerCache instance =  new EagerCache();

    private HashMap<Object,Object> map =  new HashMap<>();

    private EagerCache(){

        map=  new HashMap<Object,Object>();

    }


    public void put(Object key, Object value) {
        map = new HashMap<Object,Object>();
    }

    public Object get(Object key) {
        return map.get(key);
    }

    public static EagerCache getInstance(){
        return instance;
    }
}

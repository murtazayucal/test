package com.murtazayucal.chapter3.example2;

import java.util.HashMap;

public class Storage {

    private static   Storage instance =  new Storage();

    private HashMap<Object,Object> storage = new HashMap<>();


    public void put(Object key, Object value){
        storage.put(key,value);
    }

    public Object get(Object key){
        return storage.get(key);
    }

    public static Storage getInstance() {
        return instance;
    }
}

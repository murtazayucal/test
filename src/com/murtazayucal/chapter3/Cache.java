package com.murtazayucal.chapter3;

public interface Cache <F,S> {

    public void put (F key , S value);

    public S get( F key);
}

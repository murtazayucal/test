package com.murtazayucal.chapter1;

public class Yemek {
    public String name;



    public  static  Yemek sogukYemek(String name){

        return new Dondurma(name);
    }

    public  static  Yemek sicakYemek(String name ){
        return new Pide(name);
    }

}

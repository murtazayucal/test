package com.murtazayucal.chapter3.example2;

import com.murtazayucal.chapter3.LazyCache;

public class Car {

    private static Car instance = new Car();

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    private  String name ;
    private String year ;
    //public  Builder builder =  new Builder();

    public static class Builder {

        private  String name ;
        private String year ;
        public  Builder( ){
            super();


        }

        public Builder Name(String name ){
            this.name =  name;
            return this;

        }
        public Builder Year (String year ){
            this.year =  year;
            return this;

        }

        public Car build(){
            return new Car().Cart(this);
        }

    }

    public Car() {
    }
    public  Car Cart(Builder builder){
        this.name=builder.name;
        this.year = builder.year;
        return this;
    }

    public static Car getInstance() {

        return instance;
    }
}

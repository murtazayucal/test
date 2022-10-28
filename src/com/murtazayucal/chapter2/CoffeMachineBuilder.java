package com.murtazayucal.chapter2;

public class CoffeMachineBuilder {

    private String size;
    private String laktos;

    public String getSize() {
        return size;
    }

    public String getLaktos() {
        return laktos;
    }

    public String getSmooth() {
        return smooth;
    }

    private String smooth;


    public CoffeMachineBuilder Size(String size){
        this.size = size;
        return this;
    }
    public CoffeMachineBuilder Smooth(String smooth){
        this.smooth= smooth;
        return this;
    }
    public CoffeMachineBuilder Laktos(String laktos){
        this.laktos = laktos;
        return this;
    }



    public static class Builder {
        //required
        private final String size;

        private String laktos;
        private String smooth;

        public Builder(String size) {
            super();
            this.size = size;
        }

        public Builder Laktos(String laktos) {
            this.laktos = laktos;
            return this;
        }

        public Builder Smooth(String smooth) {
            this.smooth = smooth;
            return this;
        }

        public CoffeMachineBuilder build (){
            return new CoffeMachineBuilder(this);
        }


    }

    public  CoffeMachineBuilder (Builder builder){
        size = builder.size;
        laktos = builder.laktos;
        smooth = builder.smooth;
    }



}

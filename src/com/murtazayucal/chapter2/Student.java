package com.murtazayucal.chapter2;

public class Student {

    public String getName() {
        return name;
    }

    public int getOld() {
        return old;
    }

    public String getFrom() {
        return from;
    }

    public String getSchool() {
        return school;
    }

    public String getInstagram() {
        return instagram;
    }

    private String name;
    private int old;
    private String from;
    private String school;
    private String instagram;


    public static class Builder {
        private final  String name;
        private int old;
        private String from;
        private String school;
        private String instagram;

        public  Builder(String name ){
            super();
            this.name =  name;

        }

        public Builder Old(int old){
            this.old = old;
            return this;

        }

        public Builder From(String from){
            this.from = from;
            return this;

        }

        public Builder School(String school){
            this.school = school;
            return this;

        }

        public Builder Instagram(String instagram){
            this.instagram = instagram;
            return this;

        }

        public  Student build(){
           return new Student(this);
        }


    }

    public Student(Builder builder){
        this.name= builder.name;
        this.old= builder.old;
        this.school = builder.school;
        this.from = builder.from;
        this.instagram = builder.instagram;;
    }


}

package com.murtazayucal;

import com.murtazayucal.chapter1.Yemek;
import com.murtazayucal.chapter2.CoffeMachineBuilder;
import com.murtazayucal.chapter2.Student;
import com.murtazayucal.chapter3.DefineSingleton;
import com.murtazayucal.chapter3.EagerCache;
import com.murtazayucal.chapter3.EnumCache;
import com.murtazayucal.chapter3.LazyCache;
import com.murtazayucal.chapter3.example2.Car;
import com.murtazayucal.chapter3.example2.Storage;

public class Main {

    public static void main(String[] args) {
	// write your code here


/*      // CHAPTER 1
        Yemek yeniYemek =  Yemek.sogukYemek("kakaolu ");
        Yemek yeniYemek2 =  Yemek.sicakYemek("sucuklu ");

        System.out.println(yeniYemek.name);
        System.out.println(yeniYemek2.name);
        */
        //////////////////////////////////////////////////////////////////////////////

        // CHAPTER 2


        //Example 1

        /*
        CoffeMachineBuilder coffe =  new CoffeMachineBuilder.Builder("small").Laktos("olsun").Smooth("olsun").build();

        System.out.println(coffe.getSize());
        System.out.println(coffe.getLaktos());
        System.out.println(coffe.getSmooth());
        */


        //Example 2
        /*Student yeni = new Student.Builder("murtaza")
                .Old(25)
                .From("Igdir / TURKEY")
                .Instagram("@murtazayucal")
                .School("Sakarya Universty")
                .build();


        System.out.println(yeni.getName());
        System.out.println(yeni.getOld());
        System.out.println(yeni.getFrom());
        System.out.println(yeni.getInstagram());
        System.out.println(yeni.getSchool());*/
        //////////////////////////////////////////////////////////////////////////////

        // CHAPTER 3

        //Example 1 - Define Singleton
/*

        DefineSingleton ds1 =  DefineSingleton.getInstance();
        DefineSingleton ds2 =  DefineSingleton.getInstance();
        System.out.println(ds1.hashCode());
        System.out.println(ds2.hashCode());
*/

        //Example 2 - Cache Singleton


        /*new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(1);

                }catch (InterruptedException e){

                }
                System.out.println("HashCode of Lazy  :" + LazyCache.getInstance().hashCode());
                System.out.println("HashCode of Eager :" + EagerCache.getInstance().hashCode());
                System.out.println("HashCode of Enum  :" + EnumCache.INSTANCE.hashCode());
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("HashCode of Lazy  :" + LazyCache.getInstance().hashCode());
                System.out.println("HashCode of Eager :" + EagerCache.getInstance().hashCode());
                System.out.println("HashCode of Enum  :" + EnumCache.INSTANCE.hashCode());
            }
        }).start();*/


        // Car save storage

        Storage storage =  Storage.getInstance();



        Car newCar =  new Car.Builder().Name("opel").Year("2020").build();
        Car newCar1=  new Car.Builder().Name("fiat").Year("2020").build();
        storage.put("opel",newCar);
        storage.put("fiat",newCar1);
        /*Car newCar1 =  Car.getInstance().builder.Name("sea1").Year("2022").build();
        Car newCar2 =  Car.getInstance().builder.Name("sea2").Year("2022").build();*/

        Storage storage1=  Storage.getInstance();

        System.out.println(newCar.hashCode());
       System.out.println(newCar1.hashCode());
       System.out.println(storage.hashCode());
       System.out.println(storage1.hashCode());
 /*        System.out.println(newCar2.getName());

        System.out.println(newCar.hashCode());
        System.out.println(newCar1.hashCode());
        System.out.println(newCar2.hashCode());*/






    }
}

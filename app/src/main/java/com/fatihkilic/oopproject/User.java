package com.fatihkilic.oopproject;

public class User extends People{

    //Property
    String name;
    String job;

    //Constructor : her bir obje oluşturulduğunda çağırılan method
    public User(String name, String job) {
        this.name = name;
        this.job = job;
        System.out.println("User Created");
    }
}

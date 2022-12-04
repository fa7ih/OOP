package com.fatihkilic.oopproject;

public class SuperMusician extends Musicians
{
    public SuperMusician(String name, String instrument, int age) {
        super(name, instrument, age);
    }

    public String sing(){
        return "Şu Dağlar Kömürdendir";
    }
}

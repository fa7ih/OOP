package com.fatihkilic.oopproject;

public class Musicians {
    private String name;
    private String instrument;
    private int age;

    public Musicians(String name,String instrument,int age){
        this.name=name;
        this.instrument=instrument;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public String getInstrument() {
        return instrument;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name , String password) {
        if (password.matches("Fatih")){
            this.name = name;
        } else {
            System.out.println("Password wrong name not changed!");
        }

    }

    public void setInstrument(String instrument , String password) {
        if (password.matches("Fatih")){
            this.instrument = instrument;
        } else {
            System.out.println("Password wrong instrument not changed!");
        }
    }

    public void setAge(int age , String password) {
        if (password.matches("Fatih")){
            this.age = age;
        } else {
            System.out.println("Password wrong age not changed!");
        }
    }
}

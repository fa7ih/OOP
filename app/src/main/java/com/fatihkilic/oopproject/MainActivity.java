package com.fatihkilic.oopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* User myUser = new User();
        myUser.name="Fatih";
        myUser.job="Software";

        User newUser = new User();
        newUser.name="Kirk";
        newUser.job="musicians";
        */
        User myUser = new User("Fatih","Software");
        System.out.println(myUser.name);

        //Encapsulation:An object from the class I wrote will be created, but the properties will not be changed.
        Musicians myMusicians = new Musicians("Cem ADRİAN","saz",42);
        System.out.println(myMusicians.getName());
        //if the password is correct
        myMusicians.setAge(43,"Fatih");
        System.out.println(myMusicians.getAge());
        //if the password is wrong
        myMusicians.setName("Ahmet ASLAN","Enes");
        System.out.println(myMusicians.getName());

        //Inheritance:one class inheritance from another
        //inheritance class SuperMusicians :)
        SuperMusician superMusician = new SuperMusician("Ender Balkır","saz",58);
        System.out.println(superMusician.sing());
        System.out.println(superMusician.getName());
        //if the password is correct
        superMusician.setAge(59,"Fatih");
        //if the password is wrong
        superMusician.setName("Ahmet ASLAN","Enes");
        System.out.println(myMusicians.getName());

        //Polymorphism:The use of a method in multiple operations with the same name
        //Static Polymorphism:It is used to use methods with the same name in the same class differently.
        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(8,9));
        System.out.println(mathematics.sum(8,9,10));
        //Dynamic Polymorphism:
        Animal animal = new Animal();
        animal.sing();
        Dog dog = new Dog();
        dog.test();
        dog.sing();

        //Abstract
        User user = new User("Enes","Software");
        System.out.println(user.information());

        //Interface
        Piano piano = new Piano();
        piano.brand="Yamaha";
        piano.digital=true;
        piano.info();
    }
}
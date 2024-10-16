package org.example.abstract_class;

public abstract class Animal {

    String name;

    void printName(){
        System.out.println(name);
    }

    abstract void walk();
}

abstract class Dog extends Animal{
    String breed;
}

class Pug extends Dog{

    public void walk(){
        System.out.println("Pug is walking");
    }
}


abstract class Bird{
    String colour;
}

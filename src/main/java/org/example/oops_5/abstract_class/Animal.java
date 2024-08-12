package org.example.oops_5.abstract_class;

public abstract class Animal {

    String name;
    int age;

    void printName(){
        System.out.println(name);
    }

    abstract void walk();
}

package org.example.oops_4.interfaces;

public class Main {

    public static void main(String[] args) {
        Animal abc = new Dog();
        abc.eat();
        abc.walk();
        abc.run();

        //animal = new Animal(); //'Animal' is abstract; cannot be instantiated
    }
}

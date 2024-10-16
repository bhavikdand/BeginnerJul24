package org.example.abstract_class;

public class Main {

    public static void main(String[] args) {
        // Animal a = new Animal(); //'Animal' is abstract; cannot be instantiated
        // Dog dog = new Dog();
        Animal a = new Pug();
        a.walk();
    }
}

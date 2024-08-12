package org.example.oops_5.abstract_class;

public class Main {
    public static void main(String[] args) {
//        Animal a = new Animal(); //'Animal' is abstract; cannot be instantiated
//        Cat cat = new Cat(); //'Cat' is abstract; cannot be instantiated
        Animal a =new Dog();
        a.walk();
    }
}

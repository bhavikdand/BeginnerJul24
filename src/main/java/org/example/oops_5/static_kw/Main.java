package org.example.oops_5.static_kw;

public class Main {

    public static void main(String[] args) {
        System.out.println(ABC.s);
        ABC.print();

        ABC abc = new ABC();
        System.out.println(abc.s); //Static member 'org.example.oops_5.static_kw.ABC.s' accessed via instance reference
        abc.print(); //Static member 'org.example.oops_5.static_kw.ABC.print()' accessed via instance reference

        System.out.println("***************");

        Animal one = new Animal("Dog");
        one.age = 5;
        Animal two = new Animal("Cat");
        System.out.println(one.name);
        System.out.println(two.name);
        System.out.println(one.age);
        System.out.println(two.age);
        System.out.println(Animal.age);

        System.out.println("Changing value now");
        Animal.age = 10;
        System.out.println(one.age);
        System.out.println(two.age);
        System.out.println(Animal.age);

    }
}


class ABC{
    static String s;
    static void print(){
        System.out.println("I am static");
    }
}

class Animal {
    String name;
    static int age;

    public Animal(String name) {
        this.name = name;
    }
}

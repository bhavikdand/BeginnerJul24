package org.example.pending_topics.interfaces_revisited;

public interface Animal {

    String name = "ABC";
    void walk();

    default void talk(){
        System.out.println("Animal is talking");
    }
}

class Dog implements Animal{

    @Override
    public void walk() {

    }

    @Override
    public void talk() {
        
    }
}

class Main{
    public static void main(String[] args) {
        System.out.println(Animal.name);
//        Animal.name = " XYZ";

        Animal a = new Dog();
        a.talk();
    }
}

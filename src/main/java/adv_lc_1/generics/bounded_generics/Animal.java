package adv_lc_1.generics.bounded_generics;

public class Animal {
    String name;

    public void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
}

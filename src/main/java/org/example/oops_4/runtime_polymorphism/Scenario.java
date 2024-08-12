package org.example.oops_4.runtime_polymorphism;

import java.util.Random;

public class Scenario {

    public static void main(String[] args) {
        A a = new C();
        a.print();

        a = new B();
        a.print();

        a = new A();
        a.print();

        for(int i=0; i<10;i++) {
            A obj = getObj();
            obj.print();
        }
    }

    public static A getObj(){
        Random r = new Random();
        int random = r.nextInt();
        if(random%3==0){
            return new A();
        }
        if(random%3==1){
            return new B();
        }
        return new C();
    }

}

class A{
    void print(){
        System.out.println("A");
    }
}

class B extends A{
    void print(){
        System.out.println("B");
    }
}

class C extends B{
    void print(){
        System.out.println("C");
    }

}

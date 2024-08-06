package org.example.oops_3.demo_2;

public class Scenario3 {
    public static void main(String[] args) {
        CCC ccc = new CCC();
    }
}

class AAA{
    public AAA() {
        System.out.println("AAA");
    }
}

class BBB extends AAA{
    public BBB(String s){
        System.out.println("BBB:" + s);
    }

    public BBB(String s, int i){
        System.out.println("BBB");
    }

    public BBB(){
        System.out.println("I dont like this constructor");
    }
}

class CCC extends BBB{
    public CCC(){
        super("Hello");
        System.out.println("CCC");
    }
}
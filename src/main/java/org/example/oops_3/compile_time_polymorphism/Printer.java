package org.example.oops_3.compile_time_polymorphism;

public class Printer {

    void print(){
        System.out.println("I am empty");
    }

    void print(String s){
        System.out.println(s + " text");
    }

//    String print(String a){ // we dont consider return type in method signature
//        System.out.println("I am also empty");
//        return "";
//    }
}

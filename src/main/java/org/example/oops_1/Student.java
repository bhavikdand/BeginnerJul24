package org.example.oops_1;

public class Student {
    int age;
    float psp;
    String name;

    void changeBatch(){
        System.out.println("Changing batch");
    }

    void joinClass(){
        System.out.println(name +" is joining class");
    }

    void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("PSP: " + psp);
    }

}

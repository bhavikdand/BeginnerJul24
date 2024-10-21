package org.example.pending_topics.static_kw;

public class Student {
    String name;
    int age;
    static String university;


    public void printAge(){
        System.out.println("Age:" + age);
        System.out.println("Name:" + name);
        System.out.println("Uni:" + university);
        print();
    }

    public static void print(){
        System.out.println("Inside print method");
//        System.out.println(age);
//        System.out.println(name);
        System.out.println(university);

        //printAge(); //Because non static method might access
        // non static attrs, and our static method doesn't have access to them
    }
}

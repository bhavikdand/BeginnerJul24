package org.example.pending_topics.annonymous_class;

public class Main {
    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };

        Thread t = new Thread(r);
        t.start();
        System.out.println(Thread.currentThread().getName());

        ABC abc = new ABC(){
            public void print(){
                System.out.println("In annonymous child of ABC");
            }
        };
        abc.print();

        // Try to create an annonymous child class for XYZ
    }
}

class ABC{
    public void print(){
        System.out.println("In ABC");
    }
}

abstract class XYZ{

    public abstract void walk();
    public abstract void talk();
}

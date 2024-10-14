package org.example.conc_3.synchronized_method;

public class Adder implements Runnable{

    Count count;


    public Adder(Count count) {
        this.count = count;
    }


    @Override
    public void run() {
        for(int i=0;i <10000; i++){
            count.incrementValue();
        }
        System.out.println("Ending adder");
    }
}

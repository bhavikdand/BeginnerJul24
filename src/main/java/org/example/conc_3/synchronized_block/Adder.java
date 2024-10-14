package org.example.conc_3.synchronized_block;


public class Adder implements Runnable{

    Count count;


    public Adder(Count count) {
        this.count = count;
    }


    @Override
    public void run() {
        for(int i=0;i <10000; i++){
            synchronized (count) {
                count.num++;
            }
        }
        System.out.println("Ending adder");
    }
}

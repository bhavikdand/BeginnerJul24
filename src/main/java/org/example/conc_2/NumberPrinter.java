package org.example.conc_2;

import java.util.ArrayList;

public class NumberPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("Starting a new thread");
        for(int i=0; i<10; i++){
            System.out.println(i +" " + Thread.currentThread().getName());
        }
    }
}

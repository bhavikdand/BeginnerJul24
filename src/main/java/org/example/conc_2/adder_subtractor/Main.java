package org.example.conc_2.adder_subtractor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);

        Count count = new Count();
        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        es.execute(adder);
        es.execute(subtractor);
        es.shutdown();
        System.out.println("Final value:" + count.num);

    }
}

package org.example.conc_2.callable;

import java.util.Random;
import java.util.concurrent.Callable;

public class RandomNumberGenerator implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        System.out.println("In thread, starting to generate random number");
        int n = random.nextInt();
        Thread.sleep(1000 * 10);
        System.out.println("Random number has been generated, it is " + n);
        return n;
    }
}

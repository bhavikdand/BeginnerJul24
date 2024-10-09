package org.example.conc_1.example_2;

public class Main {
    public static void main(String[] args) {
        OddPrinter op = new OddPrinter();
        EvenPrinter ep = new EvenPrinter();

        Thread oddPrinter = new Thread(op);
        Thread evenPrinter = new Thread(ep);

        oddPrinter.start();
        evenPrinter.start(); // Try calling run() instead of start()
    }
}

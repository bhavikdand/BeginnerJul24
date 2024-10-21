package org.example.pending_topics.final_kw;

public class Main {
    public static void main(String[] args) {

        final int i = 5;
        //i = 10; //Cannot assign a value to final variable 'i'

        SuperIndian si = new SuperIndian("ABC", "XYZ");
        si.print();

        Indian indian = new Indian("QWE", "erert");

        System.out.println(Constants.PI);
    }
}

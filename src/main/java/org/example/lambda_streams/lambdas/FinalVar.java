package org.example.lambda_streams.lambdas;

public class FinalVar {

    public void doSomething(){
        final int myVar = 0;
        int var2 = 0;
        Runnable r = () -> {
            System.out.println("In a new thread");
            //myVar++; //Variable used in lambda expression should be final or effectively final
            System.out.println(myVar); // This is with final
            System.out.println(var2); // This is effective final
            int n = var2;
            n++;
        };
    }
}

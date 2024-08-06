package org.example.oops_3.demo_1;

public class Instructor extends User{
    String batchName;
    double avgRating;
    void scheduleClass(){
        System.out.println(username + " is taking " + batchName);
    }
}

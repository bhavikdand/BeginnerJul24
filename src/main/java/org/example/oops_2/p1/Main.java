package org.example.oops_2.p1;

public class Main {

    public static void main(String[] args) {
        NewStudent s = new NewStudent(20, "Jane Doe", "jane@scaler.com", 25);
        // s.age = 50; //'age' has private access in 'org.example.oops_2.p1.NewStudent'
        // s.printDetails(); // 'printDetails()' has private access in 'org.example.oops_2.p1.NewStudent'
        s.psp = 50;
        System.out.println(s.psp);
        s.email = "";
    }
}

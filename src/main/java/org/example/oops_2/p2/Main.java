package org.example.oops_2.p2;

import org.example.oops_1.Student;
import org.example.oops_2.p1.NewStudent;

public class Main {

    public static void main(String[] args) {
        NewStudent ns = new NewStudent();
        ns.email = "wqerwqer";
//        ns.psp = 50; //'psp' is not public in 'org.example.oops_2.p1.NewStudent'. Cannot be accessed from outside package
//        ns.joinClass(); // 'joinClass()' is not public in 'org.example.oops_2.p1.NewStudent'. Cannot be accessed from outside package
    }
}

package org.example.oops_2.p2;

import org.example.oops_2.p1.NewStudent;

public class NewIntelligentStudent extends NewStudent {

    public void print(){
        System.out.println(name);
//        System.out.println(age); //'age' has private access in 'org.example.oops_2.p1.NewStudent'
        //System.out.println(psp); //'psp' is not public in 'org.example.oops_2.p1.NewStudent'. Cannot be accessed from outside package
        pauseCourse();
        // printDetails(); // 'printDetails()' has private access in 'org.example.oops_2.p1.NewStudent'
    }
}

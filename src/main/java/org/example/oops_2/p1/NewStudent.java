package org.example.oops_2.p1;

public class NewStudent {
    private int age;
    float psp;
    protected String name;
    public String email;

    public NewStudent(){
        this.age = 20;
        this.email = "temp@scaler.com";
        this.name = "John Doe";
        this.psp = 10;
    }

    public NewStudent(int age, String name, String email, float psp){
       this.age = age;
       this.name = name;
       this.email = email;
       this.psp = psp;
    }

    public NewStudent(String name){
        this.name = name;
    }
//    public NewStudent(String email){ //'NewStudent(String)' is already defined in 'org.example.oops_2.p1.NewStudent'
//        this.email = email;
//    }

    void changeBatch(){
        age++;
        System.out.println("Changing batch");
        printDetails();
    }

    void joinClass(){
        System.out.println(name +" is joining class");
    }

    protected void pauseCourse(){
        System.out.println(name + " is pausing course");
    }

    private void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("PSP: " + psp);
    }
}

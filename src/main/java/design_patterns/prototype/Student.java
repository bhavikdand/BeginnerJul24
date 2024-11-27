package design_patterns.prototype;

public class Student {

    private int age;
    public String name;
    public String university;


    public Student(String name, String university, int age){
        this.name = name;
        this.age = age;
        this.university = university;
    }

    public Student(Student original){
        this.name = original.name;
        this.age = original.age;
        this.university = original.university;
    }

    public Student clone(){
        return new Student(this);
    }

}

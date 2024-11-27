package design_patterns.builder.basic;

public class Student {

    // compulusory attrs
    String name;
    String email;
    int age; // condition: > 18

    // optional attributes
    String university;
    int yearOfGraduation;

    public Student(Builder builder) throws Exception{
        if(builder.age < 18){
            throw  new Exception("Age should not be less than 18");
        }
        if(!(builder.name != null && builder.email != null)){
            throw  new Exception("All compulsory attrs must be present");
        }
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.university = builder.university;
        this.yearOfGraduation = builder.yearOfGraduation;
    }
}

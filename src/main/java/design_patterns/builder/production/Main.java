package design_patterns.builder.production;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
        1. Make the builder a static inner class
        2. Hide the Builder class via a static method called getBuilder inside Student
        3. In all the setters of Builder, return the builder object class
         */
        Student sb = Student.getBuilder()
                .setAge(25)
                .setYearOfGraduation(2024)
                .setName("ABC")
                .setEmail("a@b.com")
                .setUniversity("IIT B")
                .build();

        // Student s1 = new Student(new Student.Builder());
    }
}

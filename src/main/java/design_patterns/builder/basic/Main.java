package design_patterns.builder.basic;


public class Main {

    public static void main(String[] args) throws Exception {
        Builder builder = new Builder();
        builder.setAge(25);
        builder.setName("John Doe");
        builder.setEmail("a@b.com");
        builder.setUniversity("IIT B");
        builder.setYearOfGraduation(2024);

        Student student = new Student(builder);
        System.out.println("Student object is ready");
    }
}

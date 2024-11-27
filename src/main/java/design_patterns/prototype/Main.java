package design_patterns.prototype;


public class Main {

    public static final String STUDENT_PROTOTYPE_KEY = "STUDENT_PROTOTYPE";
    public static final String INTELLIGENT_STUDENT_PROTOTYPE_KEY = "INT_STUDENT_PROTOTYPE";

    public static void main(String[] args) {
        setupRegistry();

        Student copy = StudentRegistry.getInstance().get(STUDENT_PROTOTYPE_KEY).clone();
        Student intStudentCopy = StudentRegistry.getInstance()
                .get(INTELLIGENT_STUDENT_PROTOTYPE_KEY).clone();

        System.out.println("DEBUG");


    }

    public static void setupRegistry(){
        StudentRegistry registry = StudentRegistry.getInstance();
        Student prototypeStudent = new Student("ABC", "XYZ", 20);
        Student prototypeIntelligentStudent = new IntelligentStudent("ABC", "XYZ", 10, 100);

        registry.register(STUDENT_PROTOTYPE_KEY, prototypeStudent);
        registry.register(INTELLIGENT_STUDENT_PROTOTYPE_KEY, prototypeIntelligentStudent);
    }




}

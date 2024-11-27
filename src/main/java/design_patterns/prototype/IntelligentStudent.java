package design_patterns.prototype;

public class IntelligentStudent extends Student{

    int iq;

    public IntelligentStudent(IntelligentStudent original) {
        super(original);
        this.iq = original.iq;
    }

    public IntelligentStudent(String name, String university, int age, int iq) {
        super(name, university, age);
        this.iq = iq;
    }

    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}

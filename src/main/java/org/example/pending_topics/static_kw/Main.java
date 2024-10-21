package org.example.pending_topics.static_kw;

public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        st.age = 24;
        st.name = "John";
        st.university = "IIT B"; //Static member 'org.example.pending_topics.static_kw.Student.university' accessed via instance reference
        Student.university = "IIT D";
        System.out.println(Student.university);

        st.printAge();
        st.print();

        Student.print();
    }
}

package ss05.java;

public class Student {
    private String name;
    private String classes;

    Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setClasses("a12");
        s1.setName("Quan");
    }
}

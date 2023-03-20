package Homework.InfoSchool;

public class Learner extends Person{
    private String className;
    public Learner(String fullName, int age, String className) {

        super(fullName, age);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}

package Homework.InfoSystem;

public class Employee extends Person implements Comparable<Employee> {
    private final int id;
    private String position;
    private static int countId;
    static {
        countId = 0;
    }



    public Employee(String fullName, int age, String position) {
        super(fullName, age);
        this.position = position;
        this.id = ++countId;
    }
    public int getId() {
        return id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" + this.getFullName() +
                " position - '" + this.position + '\'' +
                "| #ID - " + id +
                '}';
    }
    @Override
    public int compareTo(Employee emp){
        return this.getFullName().compareTo(emp.getFullName());
    }
}

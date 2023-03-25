package Homework.InfoSystem;

import java.util.Objects;

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
        return "Сотрудник{ " + this.getFullName() +
                " | должность - '" + this.position + '\'' +
                " | возраст - " + this.getAge() +
                " | #ID - " + id +
                " }";
    }
    @Override
    public int compareTo(Employee emp){
        return this.getFullName().compareTo(emp.getFullName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id && position.equals(employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, position);
    }
}

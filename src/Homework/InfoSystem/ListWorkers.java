package Homework.InfoSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListWorkers implements Printable {
    private List<Employee> employees;

    public ListWorkers() {
        this.employees = new ArrayList<>();
    }
    public void add(Employee employee){
        this.employees.add(employee);
    }
    public List<Employee> getEmployees() {
        return employees;
    }
    @Override
    public void printAll(){
        for (Employee emp:employees) {
            System.out.println(emp);
        }
    }

    public void sort(){
        Collections.sort(employees);
    }

}

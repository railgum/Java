package Homework.InfoSystem;

import Planner.Note;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListWorkers {
    private List<Employee> employees;
    Table menu;

    public ListWorkers() {
        this.employees = new ArrayList<>();
        this.menu = new Table(new Scanner(System.in));
    }
    public void add(Employee employee){
        this.employees.add(employee);
    }
    public void printAll(){
        for (Employee emp:employees) {
            System.out.println(emp);
        }
    }
    public void searchLastName() throws IOException {
        System.out.println("Поиск по фамилии");
        System.out.println("Введите фамилию");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String textName = br.readLine();
        String temp = String.format("\\s\\%s", textName);
        Pattern pattern = Pattern.compile(temp);
        int count = 0;
        for (Employee emp : employees) {
            Matcher matcher = pattern.matcher(emp.getFullName());
            if(matcher.find()){
                count++;
                System.out.println(emp);
            }
        }
        if (count==0){
            System.out.printf("Сотрудника с фамилией '%s' нет", textName);
        }
    }
    public void searchByPosition() throws IOException {
        System.out.println("Поиск по должности");
        System.out.println("Введите должность сотрудника");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine().toLowerCase();
        int count = 0;
        for (Employee emp:employees) {
            if (emp.getPosition().toLowerCase().equals(text)){
                count++;
                System.out.println(emp);
            }
        }
        if (count==0){
            System.out.printf("Сотрудника с должностью '%s' нет", text);
        }
    }
    public void changeEmployee() throws IOException {
        System.out.println("Введите ID сотрудника");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        ListIterator<Employee> iterator = employees.listIterator();
        while (iterator.hasNext()){
            if(iterator.next().getId() == id){
                switch (menu.selectForChange()){
                    case "1":
                        System.out.println("Введите новые имя и фамилию");
                        String newName = scanner.nextLine();
                        iterator.set();
                }
            }
        }

    }
    public void sort(){
        Collections.sort(employees);
    }

}

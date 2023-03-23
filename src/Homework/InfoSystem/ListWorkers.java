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
        this.menu = new Table(new BufferedReader(new InputStreamReader(System.in)));
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
        boolean isExit = false;
        for (Employee emp : employees) {
            if(emp.getId() == id){
                while (!isExit){
                    switch (menu.selectForChange()){
                        case "1":
                            System.out.println("Введите новые имя и фамилию");
                            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                            String newName = br.readLine();
                            emp.setFullName(newName);
                            break;
                        case "2":
                            System.out.println("Введите правильный возраст");
                            BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
                            int newAge = br2.read();
                            emp.setAge(newAge);
                            break;
                        case "3":
                            System.out.println("Введите новую должность");
                            BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
                            String newPosition = br3.readLine();
                            emp.setPosition(newPosition);
                            break;
                        case "0":
                            isExit = true;
                        default:
                            System.out.println("Некорректный ввод");
                    }
                }
            }
        }

    }
    public void deleteEmployee(){
        System.out.println("Введите ID сотрудника, которого хотите удалить");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        ListIterator<Employee> listIterator = employees.listIterator();
        while (listIterator.hasNext()){
            if (listIterator.next().getId()==id){
                listIterator.remove();
            }
        }

    }
    public void sort(){
        Collections.sort(employees);
    }

}

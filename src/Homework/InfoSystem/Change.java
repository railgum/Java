package Homework.InfoSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Change implements Changeable<Employee> {
    private ListWorkers listWorkers;
    private Table menu;


    public Change(ListWorkers listWorkers) {
        this.listWorkers = listWorkers;
        this.menu = new Table(new BufferedReader(new InputStreamReader(System.in)));

    }
    @Override
    public void changeEmployee() throws IOException {
        System.out.println("Введите ID сотрудника");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        boolean isExit = false;
        for (Employee emp : listWorkers.getEmployees()) {
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
}

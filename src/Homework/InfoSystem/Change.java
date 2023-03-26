package Homework.InfoSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Change implements Changeable<Employee> {
    private ListWorkers listWorkers;
    private Table table;

    public Change(ListWorkers listWorkers, Table table) {
        this.listWorkers = listWorkers;
        this.table = table;
    }
    @Override
    public void changeBy(BufferedReader bufferedReader) throws IOException {
        System.out.println("Введите ID сотрудника");
        int id = Integer.parseInt(bufferedReader.readLine());
        boolean isExit = false;
        for (Employee emp : listWorkers.getEmployees()) {
            if(emp.getId() == id){
                System.out.printf("Сотрудник: %s, должность: %s, возраст: %s \n",
                                    emp.getFullName(),emp.getPosition(),emp.getAge());
                while (!isExit){
                    switch (table.selectForChange()){
                        case "1":
                            System.out.println("Введите новые имя и фамилию");
                            emp.setFullName(bufferedReader.readLine());
                            break;
                        case "2":
                            System.out.println("Введите правильный возраст");
                            emp.setAge(Integer.parseInt(bufferedReader.readLine()));
                            break;
                        case "3":
                            System.out.println("Введите новую должность");
                            emp.setPosition(bufferedReader.readLine());
                            break;
                        case "0":
                            isExit = true;
                            break;
                        default:
                            System.out.println("Некорректный ввод");
                    }
                }
                System.out.println("Обновленные данные:");
                System.out.println(emp);
            }
        }
    }
}

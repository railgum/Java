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
    public void changeBy() throws IOException {
        System.out.println("Введите ID сотрудника");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        boolean isExit = false;
        for (Employee emp : listWorkers.getEmployees()) {
            if(emp.getId() == id){
                System.out.printf("Сотрудник: %s, должность: %s, возраст: %s \n",
                                    emp.getFullName(),emp.getPosition(),emp.getAge());
                while (!isExit){
                    switch (table.selectForChange()){
                        case "1":
                            System.out.println("Введите новые имя и фамилию");
                            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                            String newName = br.readLine();
                            emp.setFullName(newName);
                            break;
                        case "2":
                            System.out.println("Введите правильный возраст");
                            BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
//                            int newAge = br2.read();
                            emp.setAge(Integer.parseInt(br2.readLine()));
                            break;
                        case "3":
                            System.out.println("Введите новую должность");
                            BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
                            String newPosition = br3.readLine();
                            emp.setPosition(newPosition);
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

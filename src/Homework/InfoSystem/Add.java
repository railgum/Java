package Homework.InfoSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Add {
    private BufferedReader scanner;

    public Add(BufferedReader scanner) {
        this.scanner = scanner;
    }

    public Employee addNewEmployee() throws IOException {
        System.out.println("Добавляем нового сотрудника");
        System.out.println("Введите имя и фамилию");
        String name = scanner.readLine();
        System.out.println("Введите возраст");
        int age = Integer.parseInt(scanner.readLine());
        System.out.println("Введите должность");
        String position = scanner.readLine();
        System.out.printf("Добавляем: %s, должность: %s, возраст: %s \n",name,position,age);

        return new Employee(name, age, position);
    }
    
}

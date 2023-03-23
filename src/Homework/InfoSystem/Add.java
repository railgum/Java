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

        return new Employee(name, age, position);
    }
    
}

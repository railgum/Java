package Homework.InfoSystem;

import java.util.Scanner;

public class Add {
    private Scanner scanner;

    public Add(Scanner scanner) {
        this.scanner = scanner;
    }

    public Employee addNewEmployee(){
        System.out.println("Добавляем нового сотрудника");
        System.out.println("Введите имя и фамилию");
        String name = scanner.nextLine();
        System.out.println("Введите возраст");
        int age = scanner.nextInt();
        System.out.println("Введите должность");
        String position = scanner.nextLine();
        String enter = scanner.nextLine();

        return new Employee(name, age, position);
    }
    
}

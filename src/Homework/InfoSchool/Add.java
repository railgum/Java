package Homework.InfoSchool;

import java.util.Scanner;

public class Add {
    private Scanner scanner;

    public Add(Scanner scanner) {
        this.scanner = scanner;
    }
    public Learner addNewLearner(){
        System.out.println("Добавляем нового ученика");
        System.out.println("Введите имя и фамилию");
        String name = scanner.nextLine();
        System.out.println("Введите возраст");
        int age = scanner.nextInt();
        System.out.println("Введите класс");
        String className = scanner.nextLine();

        return new Learner(name, age, className);
    }
    public Teacher addNewTeacher(){
        System.out.println("Добавляем нового учителя");
        System.out.println("Введите имя и фамилию");
        String name = scanner.nextLine();
        System.out.println("Введите возраст");
        int age = scanner.nextInt();
        System.out.println("Введите предмет");
        String specification = scanner.nextLine();

        return new Teacher(name, age, specification);
    }
}

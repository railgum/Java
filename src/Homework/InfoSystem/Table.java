package Homework.InfoSystem;

import java.util.Scanner;

public class Table {
    private Scanner scanner;

    public Table(Scanner scanner) {
        this.scanner = scanner;
    }
    public String selectFunction(){
        System.out.println("""
                --------------------------------------
                Добро пожаловать!
                Введите номер интересующего Вас пункта
                --------------------------------------
                ** 1 => Показать всех
                ** 2 => Найти по фамилии
                ** 3 => Найти по должности
                ** 4 => Добавить сотрудника
                ** 5 => Изменить данные сотрудника
                ** 6 => Удалить сотрудника
                ** 7 => Новости компании
                ---------------------------------------
                ** 0 => Выход
                """);
        return scanner.nextLine();
    }

    public String searchByName(){
        System.out.println("""
                ------------------------------
                Выберите фамилию
                ------------------------------
                ** => Выход
                """);
        return scanner.nextLine();
    }
    public String  searchByPosition(){
        System.out.println("""
                ------------------------------
                Введите должность
                ------------------------------
                ** 0 => Выход
                """);
        return scanner.nextLine();
    }
    public String selectForChange(){
        System.out.println("""
                -------------------------------
                Что вы хотите изменить?
                -------------------------------
                ** 1 => Изменить имя/фамилию
                ** 2 => Изменить возраст
                ** 3 => Изменить должность
                -------------------------------
                ** 0 => Выход""");
        return scanner.nextLine();
    }
   public String selectNews(){
       System.out.println("""
                ------------------------------
                Подключение к соцсетям
                ------------------------------
                ** 0 => Выход
                """);
       return scanner.nextLine();
   }


}

package Homework.InfoSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Table {
    private BufferedReader scanner;

    public Table(BufferedReader scanner) {
        this.scanner = scanner;
    }
    public String selectFunction() throws IOException {
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
        return scanner.readLine();
    }

    public String selectForChange() throws IOException {
        System.out.println("""
                -------------------------------
                Что вы хотите изменить?
                -------------------------------
                ** 1 => Изменить имя/фамилию
                ** 2 => Изменить возраст
                ** 3 => Изменить должность
                -------------------------------
                ** 0 => Выход""");
        return scanner.readLine();
    }
   public String selectNews() throws IOException {
       System.out.println("""
                ------------------------------
                Подключение к соцсетям
                ------------------------------
                ** 0 => Выход
                """);
       return scanner.readLine();
   }


}

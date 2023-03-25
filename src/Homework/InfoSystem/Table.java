package Homework.InfoSystem;

import java.io.BufferedReader;
import java.io.IOException;

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
                ** 2 => Добавить
                ** 3 => Поиск
                ** 4 => Изменить данные
                ** 5 => Удалить
                ** 6 => Новости
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
                ** 0 => Выход
                """);
        return scanner.readLine();
    }
    public String selectForSearch() throws IOException {
        System.out.println("""
                -------------------------------
                Найти сотрудника:
                -------------------------------
                ** 1 => по фамилии
                ** 2 => по должности
                -------------------------------
                ** 0 => Выход
                """);
        return scanner.readLine();
    }
    public String selectForDelete() throws IOException{
        System.out.println("""
                -------------------------------
                Удалить сотрудника:
                -------------------------------
                ** 1 => по ID
                ** 2 => удалить всех
                -------------------------------
                ** 0 => Выход
                """);
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

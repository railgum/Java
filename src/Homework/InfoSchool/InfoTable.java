package Homework.InfoSchool;

import java.util.Scanner;

public class InfoTable {
    private Scanner scanner;

    public InfoTable(Scanner scanner) {
        this.scanner = scanner;
    }
    public String selectFunction(){
        System.out.println("""
                --------------------------------------
                Добро пожаловать!
                Введите номер интересующего Вас пункта
                --------------------------------------
                ** 1 => Расписание занятий
                ** 2 => Преподавательский состав
                ** 3 => Данные учеников
                ** 4 => Кружки/секции
                ** 5 => Новости школы
                ---------------------------------------
                ** 0 => Выход
                """);
        return scanner.nextLine();
    }

    public String selectDay(){
        System.out.println("""
                ------------------------------
                Выберите день недели
                ------------------------------
                ** 1 => Понедельник
                ** 2 => Вторник
                ** 3 => Среда
                ** 4 => Четверг
                ** 5 => Пятница
                ------------------------------
                ** => Выход
                """);
        return scanner.nextLine();
    }
    public String  selectClasses(){
        System.out.println("""
                ------------------------------
                Наберите номер класса
                ------------------------------
                0 => Выход
                """);
        return scanner.nextLine();
    }
   public String selectSections(){
       System.out.println("""
                ------------------------------
                Список кружков
                ------------------------------
                0 => Выход
                """);
       return scanner.nextLine();
   }
   public String selectNews(){
       System.out.println("""
                ------------------------------
                Подключение к соцсетям школы
                ------------------------------
                0 => Выход
                """);
       return scanner.nextLine();
   }


}

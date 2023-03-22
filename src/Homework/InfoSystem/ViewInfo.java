package Homework.InfoSystem;

import java.io.IOException;
import java.util.Scanner;

public class ViewInfo {
    private Scanner scanner;
    private Table table;
    private ListWorkers listWorkers;
    private Add add;

    public ViewInfo(Scanner scanner, Table table, ListWorkers listWorkers, Add add) {
        this.scanner = scanner;
        this.table = table;
        this.listWorkers = listWorkers;
        this.add = add;
    }
    public void printInfo() throws IOException {
        while (true){
            switch (table.selectFunction()){
                case "1":
                    listWorkers.sort();
                    System.out.println("Список сотрудников:");
                    listWorkers.printAll();
                    break;
                case "2":
                    listWorkers.searchLastName();
                    break;
                case "3":
                    listWorkers.searchByPosition();
                    break;
                case "4":
                    listWorkers.add(add.addNewEmployee());
                    break;
                case "5":
                    listWorkers.changeEmployee();
                    break;
                case "6":
                    //listWorkers.deleteEmployee();
                    break;
                case "7":
                    System.out.println("Подключение к каналу");
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Введите корректное значение");
            }
        }
    }
}

package Homework.InfoSystem;

import java.io.BufferedReader;
import java.io.IOException;

public class ViewInfo {
    private final BufferedReader scanner;
    private final Table table;
    private final ListWorkers listWorkers;
    private final Add add;
    private final Search search;
    private final Change change;
    private final Delete delete;

    public ViewInfo(BufferedReader scanner,
                    Table table,
                    ListWorkers listWorkers,
                    Add add,
                    Search search,
                    Change change,
                    Delete delete) {
        this.scanner = scanner;
        this.table = table;
        this.listWorkers = listWorkers;
        this.add = add;
        this.search = search;
        this.change = change;
        this.delete = delete;
    }
    public void printInfo() throws IOException {
        while (true){
            switch (table.selectFunction()){
                case "1":
                    System.out.println("Список сотрудников:");
                    listWorkers.sort();
                    listWorkers.printAll();
                    break;
                case "2":
                    listWorkers.add(add.addNewEmployee());
                    break;
                case "3":
                    search.searchBy(scanner);
                    break;
                case "4":
                    change.changeBy(scanner);
                    break;
                case "5":
                    delete.deleteBy(scanner);
                    break;
                case "6":
                    table.selectNews();
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Введите корректное значение");
            }
        }
    }
}

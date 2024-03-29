package Homework.InfoSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {
        public static void updateView() throws IOException {
            Employee employee1 = new Employee("Сергей Иванов", 33, "Гидравлик");
            Employee employee2 = new Employee("Иван Сергеев", 30, "Механик");
            Employee employee3 = new Employee("Дмитрий Волков", 41, "Мастер");
            Employee employee4 = new Employee("Елена Дёмина", 23, "Слесарь");
            Employee employee5 = new Employee("Ренат Баев", 52, "Электрик");

            ListWorkers listWorkers = new ListWorkers();
            listWorkers.add(employee1);
            listWorkers.add(employee2);
            listWorkers.add(employee3);
            listWorkers.add(employee4);
            listWorkers.add(employee5);

            BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
            Table table = new Table(scanner);
            Add add = new Add(scanner);
            Search search = new Search(listWorkers,table);
            Change change = new Change(listWorkers,table);
            Delete delete = new Delete(listWorkers,table);

            ViewInfo viewInfo = new ViewInfo(scanner,table,listWorkers,add,search,change,delete);
            viewInfo.printInfo();
        }
}
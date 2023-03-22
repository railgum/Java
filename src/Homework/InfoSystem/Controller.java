package Homework.InfoSystem;

import java.io.IOException;
import java.util.Scanner;

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

            Scanner scanner = new Scanner(System.in);
            Table table = new Table(scanner);
            Add add = new Add(scanner);

            ViewInfo viewInfo = new ViewInfo(scanner, table, listWorkers, add);

            viewInfo.printInfo();
        }
}
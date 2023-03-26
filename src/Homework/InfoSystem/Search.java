package Homework.InfoSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Search implements Searcheable<Employee> {
    private ListWorkers listWorkers;
    private Table table;
    private BufferedReader br;

    public Search(ListWorkers listWorkers, Table table) {

        this.listWorkers = listWorkers;
        this.table = table;
    }
    @Override
    public void searchBy(BufferedReader br) throws IOException {
        this.br = br;
        boolean isExit = false;
        while (!isExit){
            switch (table.selectForSearch()){
                case "1":
                    System.out.println("Поиск по фамилии");
                    System.out.println("Введите фамилию");
                    String textName = br.readLine();
                    String temp = String.format("\\s\\%s", textName);
                    Pattern pattern = Pattern.compile(temp);
                    int count1 = 0;
                    for (Employee emp : listWorkers.getEmployees()) {
                        Matcher matcher = pattern.matcher(emp.getFullName());
                        if(matcher.find()){
                            count1++;
                            System.out.println("Найдено:");
                            System.out.println(emp);
                        }
                    }
                    if (count1==0){
                        System.out.printf("Сотрудника с фамилией '%s' нет", textName);
                    }
                    break;
                case "2":
                    System.out.println("Поиск по должности");
                    System.out.println("Введите должность сотрудника");
                    String text = br.readLine().toLowerCase();
                    int count2 = 0;
                    for (Employee emp:listWorkers.getEmployees()) {
                        if (emp.getPosition().toLowerCase().equals(text)){
                            count2++;
                            System.out.println("Найдено:");
                            System.out.println(emp);
                        }
                    }
                    if (count2==0){
                        System.out.printf("Сотрудника с должностью '%s' нет", text);
                    }
                    break;
                case "0":
                    isExit = true;
                    break;
                default:
                    System.out.println("Некорректный ввод");
            }
        }
    }
}

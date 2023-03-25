package Homework.InfoSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ListIterator;

public class Delete implements Deleteable<Employee> {
    private ListWorkers listWorkers;
    private Table table;

    public Delete(ListWorkers listWorkers, Table table) {
        this.listWorkers = listWorkers;
        this.table = table;
    }
    @Override
    public void deleteBy() throws IOException {
        boolean isExit = false;
        while (!isExit){
            switch (table.selectForDelete()){
                case "1":
                    System.out.println("Введите ID сотрудника, которого хотите удалить");
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                    int id = Integer.parseInt(bufferedReader.readLine());
                    ListIterator<Employee> listIterator = listWorkers.getEmployees().listIterator();
                    int countID = 0;
                    while (listIterator.hasNext()){
                        if (listIterator.next().getId()==id){
                            System.out.println("Удаляем сотрудника: " + listIterator.previous().getFullName());
                            listIterator.remove();
                            countID++;
                        }
                    }
                    if (countID==0){
                        System.out.println("Сотрудника с таким ID нет");
                    }
                    break;
                case "2":
                    System.out.println("Вы действительно хотите удалить данные всех сотрудников? 1 - 'да'");
                    BufferedReader brAll = new BufferedReader(new InputStreamReader(System.in));
                    String answer = brAll.readLine();
                    if("1".equals(answer)){
                        listWorkers.getEmployees().clear();
                    }
                    break;
                case "0":
                    isExit = true;
                default:
                    System.out.println("Некорректный ввод");
            }
        }
    }
}

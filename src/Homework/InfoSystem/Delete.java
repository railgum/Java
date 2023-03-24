package Homework.InfoSystem;

import java.util.ListIterator;
import java.util.Scanner;

public class Delete implements Deleteable<Employee> {
    private ListWorkers listWorkers;

    public Delete(ListWorkers listWorkers) {
        this.listWorkers = listWorkers;
    }
    @Override
    public void deleteEmployee(){
        System.out.println("Введите ID сотрудника, которого хотите удалить");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        ListIterator<Employee> listIterator = listWorkers.getEmployees().listIterator();
        while (listIterator.hasNext()){
            if (listIterator.next().getId()==id){
                listIterator.remove();
            }
        }
        scanner.close();
    }

    @Override
    public void deleteAll() {
        System.out.println("Вы действительно хотите удалить данные всех сотрудников? 1 - 'да'");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if("1".equals(answer)){
            listWorkers.getEmployees().clear();
        }
        scanner.close();
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        /*
        * 1 Реализовать телефонный справочник
          HashMap<Login, Список телефонов> с возможностью:
            - добавлять телефон
            - удалять телефон
            - находить по логину телефон/список телефонов
        */

        HashMap<String, HashMap> phoneBook = new HashMap<>();
        menu(phoneBook);

    }
    static void menu(HashMap phB){
        System.out.print("\033[H\033[2J");
        System.out.println("Телефонный справочник");
        System.out.println("Выберите нужный пункт");
        System.out.println("1 - Добавить телефон");
        System.out.println("2 - Удалить телефон");
        System.out.println("3 - Найти телефон по логину");
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        scanner.close();
        switch (num) {
            case "1": addNumber(phB);
            break;
            case "2": deleteNumber(phB);
            break;
            case "3": searchNumber(phB);
            break;
            default:
                System.out.println("Выберите нужный пункт");
        }
    }
    static void addNumber(HashMap phB){
        Scanner scanner = new Scanner(System.in);

        String login = scanner.nextLine();
        System.out.println("Введите логин");
        scanner.nextLine();
        String number = scanner.nextLine();
        System.out.println("Введите номер телефона");

        scanner.close();
        int k=0;
        if (!phB.containsKey(login)) {
            phB.put(login,number);
        } else phB.putIfAbsent(login,number);
    }
    static void deleteNumber(HashMap phB){
        System.out.println("delete");
    }
    static void searchNumber(HashMap phB) {
        System.out.println("search");
    }
}

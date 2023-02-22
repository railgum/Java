import com.sun.jdi.Value;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Homework4 {
    /*
          Реализовать телефонный справочник
          HashMap<Login, Список телефонов> с возможностью:
            - добавлять телефон
            - удалять телефон
            - находить по логину телефон/список телефонов
     */
    public static void main(String[] args) {
        HashMap<String, HashSet> phoneBook = new HashMap<>();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int x = 0;
            String s = "";
            while (!"4".equals(s)) {
                System.out.println("Телефонный справочник");
                System.out.println("Выберите нужный пункт");
                System.out.println("1 - Добавить телефон");
                System.out.println("2 - Удалить телефон");
                System.out.println("3 - Найти телефон по логину");
                System.out.println("4 - Выход");
                s = br.readLine();

                try {
                    x = Integer.parseInt(s);
                } catch (NumberFormatException e) {
                    System.out.println("Неверный ввод");
                }

                switch (x) {
                    case 1:
                        addNumber(phoneBook);
                        break;
                    case 2:
                        // вызов метода 2
                        break;
                    case 3:
                        // вызов метода 3
                }
            }
            System.out.println("Доброго дня!");
        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
    static void deleteNumber(HashMap phB){
        System.out.println("delete");
    }
    static void searchNumber(HashMap phB) {
        System.out.println("search");
    }

    private static void addNumber(HashMap<String, HashSet> phoneBook) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите логин");
            String login = br.readLine();
            System.out.println("Введите номер телефона");
            String number = br.readLine();
            if (!phoneBook.containsKey(login)) {
                HashSet<String> phoneNumber = new HashSet<>();
                phoneNumber.add(number);
                phoneBook.put(login,new HashSet<>(phoneNumber));
            } else {
                HashSet<String> phoneNumber = phoneBook.get(login);
                phoneNumber.add(number);
                phoneBook.putIfAbsent(login,phoneNumber);
            };
            for (Map.Entry<String,HashSet> item : phoneBook.entrySet()) {
                System.out.println("Логин - " + item.getKey());
                System.out.println("Телефон - " + item.getValue());

            }
        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}

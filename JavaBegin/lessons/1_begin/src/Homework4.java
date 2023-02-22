import com.sun.jdi.Value;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Homework4 {
    /*
          Реализовать телефонный справочник
          HashMap<Login, Список телефонов> с возможностью:
            - добавлять телефон
            - удалять телефон
            - находить по логину телефон/список телефонов
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        HashMap<String, HashSet> phoneBook = new HashMap<>();
        // Меню справочника
        Scanner br = new Scanner(System.in);
        int x = 0;
        String s = "";
        // Циклический опрос консоли
        do {
            System.out.println("Телефонный справочник");
            System.out.println("Выберите нужный пункт");
            System.out.println("1 - Добавить телефон");
            System.out.println("2 - Удалить телефон");
            System.out.println("3 - Найти телефон по логину");
            System.out.println("4 - Выход");
            s = br.next();

            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод");
            }

            switch (x) {
                case 1:
                    System.out.println("Добавление номера");
                    String login = getContact("Введите логин");
                    String number = getContact("Введите номер");
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
                    break;

                case 2:
                    System.out.println("Удаление номера");
                    login = getContact("Введите логин");
                    number = getContact("Введите номер");
                    if (!phoneBook.containsKey(login)) {
                        System.out.println("Такого контакта нет");
                    } else {
                        HashSet<String> phoneNumber = phoneBook.get(login);
                        phoneNumber.remove(number);
                    };
                    for (Map.Entry<String,HashSet> item : phoneBook.entrySet()) {
                        System.out.println("Логин - " + item.getKey());
                        System.out.println("Телефон - " + item.getValue());

                    }
                    break;

                case 3:
                    System.out.println("Поиск номера");
                    login = getContact("Введите логин");
                    if (!phoneBook.containsKey(login)) {
                        System.out.println("Такого контакта нет");
                    } else {
                        HashSet<String> phoneNumber = phoneBook.get(login);
                        Iterator<String> iterator = phoneNumber.iterator();
                        while (iterator.hasNext()){
                            System.out.println(iterator.next());
                        }
                    }
            }
        } while (!"4".equals(s));
        System.out.println("Доброго дня!");
        br.close();
    }
    public static String getContact(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String value = scanner.next();
        return value;

    }

}


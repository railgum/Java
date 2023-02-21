import java.util.HashMap;
import java.util.Scanner;
import

public class Homework4 {
    /*
          Реализовать телефонный справочник
          HashMap<Login, Список телефонов> с возможностью:
            - добавлять телефон
            - удалять телефон
            - находить по логину телефон/список телефонов
     */
    private final Scanner scanner;
    public Homework4(Scanner scanner) {
        this.scanner = scanner;
    }
    private void printMenu(){
        //System.out.print("\033[H\033[2J");
        System.out.println("Телефонный справочник");
        System.out.println("Выберите нужный пункт");
        System.out.println("1 - Добавить телефон");
        System.out.println("2 - Удалить телефон");
        System.out.println("3 - Найти телефон по логину");
        System.out.println("4 - Выход");
    }

    public void run(pB){
        if (this.scanner != null){
            int number;
            do{
                printMenu();
                number=this.scanner.nextInt();
                switch (number){
                    case 1: addNumber(pB);
                        break;
                    case 2: deleteNumber(pB);
                        break;
                    case 3: searchNumber(pB);
                        break;
                    case 4:
                        System.out.println("Всего хорошего!...");
                        break;
                    default:
                        System.out.println("Выберите нужный пункт");
                }
            } while (number!=4);
        }
    }
    public static void main(String[] args) {
        HashMap<String, HashMap> phoneBook = new HashMap<>();
        run(phoneBook);
    }
    static void addNumber(HashMap pB){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();

        scanner.nextLine();
        String number = scanner.nextLine();
        System.out.println("Введите номер телефона");

        scanner.close();
        //int k=0;
        if (!phB.containsKey(login)) {
            phB.put(login,number);
        } else phB.putIfAbsent(login,number);
    }
    static void deleteNumber(HashMap phB){
        System.out.println("delete");
        menu(phB);
    }
    static void searchNumber(HashMap phB) {
        System.out.println("search");
        menu(phB);

    }
}

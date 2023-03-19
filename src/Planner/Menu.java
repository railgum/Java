package Planner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    private boolean isExit = false;
    Diary diary;

    public Menu(Diary diary) {

        this.diary = diary;
    }

    public void run() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (!isExit) {
                printMenu();
                String line = br.readLine();
                switch (line) {
                    case "1":
                        diary.printToConsole();
                        break;
                    case "2":
                        diary.addNote();
                        break;
                    case "3":
                        diary.searchText();
                        break;
                    case "4":
                        diary.searchPriority();
                        break;
                    case "5":
                        diary.printToFile();
                        break;
                    case "0":
                        isExit = true;
                        break;
                }
            }
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    void printMenu(){
        System.out.println("""
            ---------------------------------
            Выберите нужный пункт:
            ----------------------------------
            1 -> Показать всё
            2 -> Добавить запись
            3 -> Найти запись по ключевому слову
            4 -> Найти запись по важности
            5 -> Записать в файл
            6 -> Чо-нить, исчо не придумал
            ----------------------------------
            0 -> Выход
            """
        );
    }

}

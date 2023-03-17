package Planner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {
    //private List items = new ArrayList();
    private boolean isExit = false;
    Diary diary;

    public Menu(Diary diary) {
        this.diary = diary;
    }

    public void run(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (!isExit){
            printMenu();
            try {
                String line = br.readLine();
                int point = Integer.parseInt(line);
                switch (point){
                    case 1:
                        diary.printToConsole();
                        break;
                    case 2:
                        System.out.println("Метод добавления записи");
                        //diary.addNote();
                        break;
                    case 3:
                        System.out.println("Меню поиска");
                        break;
                    case 4:
                        System.out.println("Меню выбора типа файла");
                        break;
                    case 0:
                        System.exit(0);
                        break;
                }
            } catch (IOException exception){
                exception.printStackTrace();
            }
        }
    }

    void printMenu(){
        System.out.println("""
            ---------------------------------
            Выберите нужный пункт:
            ----------------------------------
            1 -> Показать всё
            2 -> Добавить запись
            3 -> Найти
            4 -> Записать в файл
            ----------------------------------
            0 -> Выход
            """
        );
    }
}

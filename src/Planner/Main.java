package Planner;

import java.time.format.DateTimeFormatter;

import static Planner.Priority.high;
import static Planner.Priority.medium;

public class Main {
    public static void main(String[] args) {
        Person rail = new Person("Раиль", "Гумеров");
        Note note1 = new Note("Сделать меню", rail, "18-03-2023", high);
        Note note2 = new Note("Сделать поиски по id, text, date",rail,"19-03-2023",medium);


        Diary diary = new Diary();
        diary.addNote(note1);
        diary.addNote(note2);
        diary.printToConsole();
    }
}

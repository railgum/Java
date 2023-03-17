package Planner;

import java.time.format.DateTimeFormatter;

import static Planner.Priority.*;

public class Main {
    public static void main(String[] args) {
        Person rail = new Person("Раиль", "Гумеров");
        Note note1 = new Note("Сделать планировщик? Легко!", rail, "16-03-2023", low);
        Note note2 = new Note("Вроде всё понятно, но...", rail, "17-03-2023", medium);
        Note note3 = new Note("Да как тут это делать то?",rail,"18-03-2023",high);
        Note note4 = new Note("Кто это у нас тут программист?",rail,"19-03-2023",immediate);

        Diary diary = new Diary();
        diary.addNote(note1);
        diary.addNote(note2);
        diary.addNote(note3);
        diary.addNote(note4);
        //diary.printToConsole();
        //diary.printToFile("xml");
        //diary.searchId(3);
        //diary.searchText("тут");
        //diary.searchPriority(immediate);
    }
}

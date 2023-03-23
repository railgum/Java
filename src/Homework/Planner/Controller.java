package Homework.Planner;

import static Homework.Planner.Priority.*;
import static Homework.Planner.Priority.immediate;

public class Controller {
    public static void start() {
        Note note1 = new Note("Сделать планировщик? Легко!", "Раиль Гумеров", "16-03-2023", low);
        Note note2 = new Note("Вроде всё понятно, но...", "Раиль Гумеров", "17-03-2023", medium);
        Note note3 = new Note("Да как тут это делать то?","Раиль Гумеров","18-03-2023",high);
        Note note4 = new Note("Кто это у нас тут программист?","Раиль Гумеров","19-03-2023",immediate);

        Diary diary = new Diary();
        diary.addNote(note1);
        diary.addNote(note2);
        diary.addNote(note3);
        diary.addNote(note4);

        Menu menu = new Menu(diary);
        menu.run();
    }
}

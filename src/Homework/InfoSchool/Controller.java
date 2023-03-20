package Homework.InfoSchool;

import java.util.Scanner;

public class Controller {
    private ViewInfo view;
    private ListTeachers listTeachers;
    private ListLearners listLearners;

    public Controller() {
        public static void updateView() {
            Learner learner1 = new Learner("Сергей Иванов", 13, "6");
            Learner learner2 = new Learner("Иван Сергеев", 10, "4");
            Learner learner3 = new Learner("Дмитрий Волков", 11, "4");
            Learner learner4 = new Learner("Елена Дёмина", 13, "6");
            Learner learner5 = new Learner("Ренат Баев", 12, "5");

            ListLearners listLearners = new ListLearners();
            listLearners.add(learner1);
            listLearners.add(learner2);
            listLearners.add(learner3);
            listLearners.add(learner4);
            listLearners.add(learner5);

            Teacher teacher1 = new Teacher("Петр Сидоров", 34, "математика");
            Teacher teacher2 = new Teacher("Анна Каренина", 30, "русский язык");
            Teacher teacher3 = new Teacher("Макар Логинов", 28, "биология");
            Teacher teacher4 = new Teacher("Михаил Игнатов", 41, "география");

            ListTeachers listTeachers = new ListTeachers();
            listTeachers.add(teacher1);
            listTeachers.add(teacher2);
            listTeachers.add(teacher3);
            listTeachers.add(teacher4);

            Scanner scanner = new Scanner(System.in);
            InfoTable infoTable = new InfoTable(scanner)
            ViewInfo viewInfo = new ViewInfo(scanner);
            Add add = new Add(scanner);

            view.printSchool();
        }
    }
}
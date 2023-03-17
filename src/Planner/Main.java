package Planner;

import java.time.format.DateTimeFormatter;

import static Planner.Priority.*;

public class Main {
    public static void main(String[] args) {

        //diary.printToConsole();
        //diary.printToFile("xml");
        //diary.searchId(3);
        //diary.searchText("тут");
        //diary.searchPriority(immediate);

        Controller.start();
    }
}

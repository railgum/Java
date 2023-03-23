package Homework.Planner;

import java.io.IOException;

public interface Search {
    void searchId(int id);
    void searchText() throws IOException;
    void searchPriority() throws IOException;
}

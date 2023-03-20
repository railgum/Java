package Homework.InfoSchool;

import java.util.ArrayList;
import java.util.List;

public class ListTeachers {
    private List<Teacher> listTeachers;

    public ListTeachers() {
        this.listTeachers = new ArrayList<>();
    }
    public void add(Teacher teacher){
        this.listTeachers.add(teacher);
    }

}

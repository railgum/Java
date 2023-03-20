package Homework.InfoSchool;

import java.util.ArrayList;
import java.util.List;

public class ListLearners {
    private List<Learner> listLearners;
    public ListLearners(){
        this.listLearners = new ArrayList<>();
    }
    public void add(Learner learner){
        this.listLearners.add(learner);
    }
    public Learner getByName(String name){
        return listLearners.stream()
                .filter(learner -> learner.getFullName().equals(name))
                .findFirst()
                .orElse(null);
    }
}

package Homework.Geo;

import java.time.LocalDate;

public interface Search {

    String searchRelation(Person person, Relationship relationship);

    String bornAfterDate(LocalDate date);

    String getGender(String gender);

    //ArrayList<String> searchBirthdayDate();
    //ArrayList<String> searchDeathdayDate();

}

package Homework.Geo;


import java.time.LocalDate;

public interface FamilyTree {
    void appendChild(Person person1, Person person2);
    void appendBrotherSister(Person person1, Person person2);
}

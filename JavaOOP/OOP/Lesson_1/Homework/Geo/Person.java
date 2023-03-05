package Lesson_1.Homework.Geo;

import java.time.LocalDate;

public class Person {
    public String fullName;
    public LocalDate birthDay;
    public LocalDate deathDay;

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
    public LocalDate getBirthDay(){return birthDay;}

    public LocalDate getDeathDay() {
        return deathDay;
    }
}

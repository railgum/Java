package Lesson_2.Homework.Geo;

import java.time.LocalDate;

public abstract class Human {
    private String fullName;
    private LocalDate birthDay;
    private LocalDate deathDay;
    private String gender;

    public Human(String fullName, String gender, LocalDate birthDay, LocalDate deathDay) {

        this.fullName = fullName;
        this.birthDay = birthDay;
        this.deathDay = deathDay;
        this.gender = gender;
    }


    public void setGender(String gender) {this.gender = gender;}

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public void setDeathDay(LocalDate deathDay) {
        this.deathDay = deathDay;
    }

    public String getFullName() {
        return fullName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public LocalDate getDeathDay() {
        return deathDay;
    }
    public String getGender() {return gender;}

}

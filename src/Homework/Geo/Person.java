package Homework.Geo;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
    private String fullName;
    private LocalDate birthDay;
    private LocalDate deathDay;
    private String gender;

    public Person(String fullName, String gender, LocalDate birthDay, LocalDate deathDay) {

        this.fullName = fullName;
        this.birthDay = birthDay;
        this.deathDay = deathDay;
        this.gender = gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }

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

    public String getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(fullName, person.fullName)
                && Objects.equals(birthDay, person.birthDay)
                && Objects.equals(deathDay, person.deathDay)
                && Objects.equals(gender, person.gender);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}

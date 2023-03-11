package Lesson_2.Homework.Geo;

import java.time.LocalDate;

import static Lesson_2.Homework.Geo.Relationship.*;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина","female", LocalDate.of(1925, 4, 17), LocalDate.of(1998, 12, 8));
        Person vasya = new Person("Вася","male", LocalDate.of(1949, 1, 7), LocalDate.of(2017, 9, 13));
        Person masha = new Person("Маша","female", LocalDate.of(1951, 12, 27), LocalDate.of(2022, 8, 4));
        Person jane = new Person("Женя", "male",LocalDate.of(1978, 5, 30), null);
        Person ivan = new Person("Ваня","male", LocalDate.of(1982, 3, 11), null);
        Person lena = new Person("Лена","female", LocalDate.of(1984, 11, 2), null);

        ExampleFamily gt = new ExampleFamily();
        gt.appendChild(irina, vasya);
        gt.appendChild(irina, masha);
        gt.appendChild(vasya, jane);
        gt.appendChild(vasya, ivan);
        gt.appendChild(masha, lena);
        gt.appendBrotherSister(vasya, masha);


        //gt.printToConsole(gt.searchRelation(irina,children));
        //gt.printToConsole(gt.searchRelation(masha,brother));
        //gt.printToConsole(gt.bornAfterDate(LocalDate.of(1950,1,1)));
        //gt.printToConsole(gt.getGender("male"));
    }

}


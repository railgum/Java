package Lesson_2.Homework.Geo;

import java.time.LocalDate;

import static Lesson_1.Homework.Geo.Relationship.*;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", LocalDate.of(1925, 4, 17), LocalDate.of(1998, 12, 8));
        Person vasya = new Person("Вася", LocalDate.of(1949, 1, 7), LocalDate.of(2017, 9, 13));
        Person masha = new Person("Маша", LocalDate.of(1951, 12, 27), LocalDate.of(2022, 8, 4));
        Person jane = new Person("Женя", LocalDate.of(1978, 5, 30), null);
        Person ivan = new Person("Ваня", LocalDate.of(1982, 3, 11), null);
        Person lena = new Person("Лена", LocalDate.of(1984, 11, 2), null);

        GeoTree gt = new GeoTree();
        gt.append(irina, vasya, children);
        gt.append(irina, masha, children);
        gt.append(vasya, jane, children);
        gt.append(vasya, ivan, children);
        gt.append(masha, lena, children);
        gt.append(vasya, masha, brother);
        gt.append(masha, vasya, sister);


        Out test = new Out();
        test.searchRelationshipToConsole(masha, gt, brother);
        test.searchBirthdayToConsole(lena, gt);
        //test.saveFile(masha,gt,children,"node.txt");
    }

}


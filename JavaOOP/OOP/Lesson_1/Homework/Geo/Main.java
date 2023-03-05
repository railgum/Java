package Lesson_1.Homework.Geo;

import static Lesson_1.Homework.Geo.Relationship.*;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина");
        Person vasya = new Person("Вася");
        Person masha = new Person("Маша");
        Person jane = new Person("Женя");
        Person ivan = new Person("Ваня");
        Person lena = new Person("Лена");

        GeoTree gt = new GeoTree();
        gt.append(irina, vasya, children);
        gt.append(irina, masha, children);
        gt.append(vasya, jane, children);
        gt.append(vasya, ivan, children);
        gt.append(masha, lena, children);
        gt.append(vasya, masha, brother);
        gt.append(masha,vasya, sister);


        Out test = new Out();
        test.printConsole(masha,gt,brother);
//        test.saveFile(masha,gt,children,"node.txt");
    }

}


package Homework.CatAndHuman;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик", 3, "белый");
        Person person = new Person("Раиль", 43, "мужчина");


        person.voice("Кис-кис, Мурзик");
        cat.move("Кот прибежал");
        cat.voice("Мяу");
        person.voice("Держи свою любимую кашу");
        cat.voice("Мя-я-са");
        person.voice("Мяса нет");
        cat.move("Кот обиженно побрел спать");
    }

}

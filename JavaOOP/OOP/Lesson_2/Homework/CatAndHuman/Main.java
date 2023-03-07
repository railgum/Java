package Lesson_2.Homework.CatAndHuman;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик", 3, "Белый");
        Person person = new Person("Раиль", 43, "мужчина");


        System.out.println(person.voice("кис-кис", "Мурзик,"));
        if(!cat.isSleep()){
            System.out.println(cat.voice());
        }else {
            System.out.println(cat.voiceSleep());
            System.out.println(person.voice("просыпайся, ", " соня,"));
            System.out.println(cat.voice());
        }
        System.out.println(person.getEat("Хочешь каши?"));
        if (!cat.isHungry()){
            System.out.println(cat.noHungry());
        }else System.out.println(cat.eatAll());



    }

}

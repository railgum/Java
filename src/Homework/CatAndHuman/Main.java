package Homework.CatAndHuman;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик", 3, "белый");
        Person person = new Person("Раиль", 43);


        person.voice("Кис-кис, Мурзик");
        if(cat.isSleep()){
            cat.voice("Хр-р-р");
            person.voice("Ну где ты, пройдоха?");
        }
        person.voice("Мурзик, иди сюда");
        cat.move("Кот прибежал");
        if (cat.isHungry() < 5){
            cat.voice("Мяу");
            person.voice("Есть хочешь?");
            cat.voice("Мя-я-са!");
            person.voice("Мяса нет");
            person.voice("Держи свою любимую кашу");
            cat.voice("Пф-ф-ф-ф!");
            cat.move("Кот обиженно побрел спать");
        } else {
            cat.voice("Мурр-р-р");
            person.voice(person.getName() + " погладил " + cat.getName());
        }



    }

}

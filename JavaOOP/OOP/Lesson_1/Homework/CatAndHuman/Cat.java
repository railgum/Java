package Lesson_1.Homework.CatAndHuman;

import java.util.Random;

public class Cat {
    Random rnd = new Random();
    private String name;
    private boolean hungry;
    private boolean sleep;

    public Cat(String name,boolean hungry, boolean sleep) {
        this.name = name;
        this.hungry=hungry;
        this.sleep=sleep;
    }

    public String getName() {
        return name;
    }

    public boolean isHungry() {
        return hungry = rnd.nextBoolean();
    }

    public boolean isSleep() {
        return sleep= rnd.nextBoolean();
    }

    public void setHungry(){this.hungry=true;}
    public void setSleep(){this.sleep=true;}

     public String voice() {
     return this.name + " говорит мяу";
     }
     public String voiceBad() {
        return this.name + " говорит пф-ф-ф!";
     }
     public String voiceSleep(){
        return "Хр-р-р-р";
     }
     public String noHungry(){
        return "Мя-я-са!";
     }
     public String eatAll(){
        return "Ладно, давай кашу(((";
     }
}

package Homework.CatAndHuman;

import java.util.Random;

public class Cat extends Animal implements Speak, State {
    Random rnd = new Random();

    public Cat(String name, int age, String color) {
        super(name,age,color);
    }
    @Override
     public void voice(String talk) {
         System.out.println(talk);
     }

    @Override
    public void move(String action){
        System.out.println(action);
    }


    @Override
    public boolean isSleep() {
        //System.out.println(sleep);
        boolean sleep = rnd.nextBoolean();
        return sleep;
    }

    @Override
    public int isHungry() {
        int hungry = rnd.nextInt(0,10);
        //System.out.println(hungry);
        return hungry;
    }

}

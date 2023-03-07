package Lesson_2.Homework.CatAndHuman;

import java.util.Random;

public class Cat extends Animal implements Manageable{
//    Random rnd = new Random();

    public Cat(String name, int age, String color) {
        super(name,age,color);
    }
    @Override
     public void voice() {
         System.out.println("Мяу");
     }

    @Override
    public void eat() {
        System.out.println("Хочу мя-я-су!");
    }

    @Override
    public void move() {

    }

    @Override
    public void sleep() {

    }

}

package Lesson_2.Homework.CatAndHuman;

public class Cat extends Animal implements Speak, State {
//    Random rnd = new Random();

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

    /*
    @Override

    public void isSleep(boolean sleep) {
        System.out.println(sleep);
    }
    @Override
    public void isHungry(boolean hungry) {
        System.out.println(hungry);
    }

     */
}

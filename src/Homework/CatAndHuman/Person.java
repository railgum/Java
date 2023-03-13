package Homework.CatAndHuman;

public class Person extends Human implements Speak {
    public Person(String name, int age, String sex) {
        super(name, age, sex);
    }

    @Override
    public void voice(String talk) {
        System.out.println(talk);
    }

}

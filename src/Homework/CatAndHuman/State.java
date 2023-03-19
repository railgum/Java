package Homework.CatAndHuman;

public interface State {

    void move(String action);

    boolean isSleep();

    int isHungry();
}

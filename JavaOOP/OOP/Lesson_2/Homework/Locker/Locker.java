package Lesson_2.Homework.Locker;

public class Locker {

    private boolean status;
    public Locker(){
        this.status = getStatus();
    }

    public boolean getStatus() {return status;}
    public void setStatus(boolean status) { this.status = status;}
}


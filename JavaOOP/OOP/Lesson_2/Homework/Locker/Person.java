package Lesson_2.Homework.Locker;

public class Person {
//    public Person() {
//    }
    public void openDoor(Locker locker){
        if(!locker.getStatus()){
            locker.setStatus(true);
            System.out.println("Открыл дверь");
        } else {
            locker.setStatus(false);
            System.out.println("Закрыл дверь");
        }
    }
}

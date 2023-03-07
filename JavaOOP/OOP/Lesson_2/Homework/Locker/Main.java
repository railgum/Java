package Lesson_2.Homework.Locker;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Locker locker = new Locker();

        person.openDoor(locker);
        person.openDoor(locker);
        person.openDoor(locker);
        person.openDoor(locker);
    }
}

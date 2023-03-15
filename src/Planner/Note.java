package Planner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Класс записи
 */
public class Note implements Comparable<Note> {
    private final int id;
    private static int countId;
    private String dateTimeAddNote;
    private String deadLine;
    private Person person;
    private Priority priority;
    private String text;
    static {
        countId = 0;
    }

    public Note(String text, Person person, String deadLine, Priority priority) {
        this.id = ++countId;
        this.dateTimeAddNote = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd:MM:yyyy - a hh:mm"));
        this.deadLine = deadLine;
        this.person = person;
        this.priority = priority;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String getDateTimeAddNote() {
        return dateTimeAddNote;
    }

    public void setDateTimeAddNote(String dateTimeAddNote) {
        this.dateTimeAddNote = dateTimeAddNote;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    @Override
    public String toString(){
        return "#" + getId() + " " +
                " |задача: " + getText().toUpperCase() +
                " |автор: " + getPerson() +
                " |добавлено: " + getDateTimeAddNote() +
                " |срок выполнения: " + getDeadLine() +
                " |важность: " + getPriority();
    }
    @Override
    public int compareTo(Note note){
        return this.id - note.getId();
    }


}

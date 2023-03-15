package Planner;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс хранения записей
 */
public class Diary implements PrintTo {
    private final List<Note> notes;
    private String path = "X:/Geek/Developer/2_block/Java/Java/src/Planner";
    public Diary() {
        this.notes = new ArrayList<>();
    }
    public void addNote(Note note){
        notes.add(note);
    }
    public void getAllNotes(){
        for (Note n:notes) {
            System.out.println(n);
        }
    }

    @Override
    public void printToConsole() {
        for (Note n:notes) {
            System.out.println(n);
        }
    }

    @Override
    public void printToFile(FileFormat fileFormat, String path) {
        try(FileOutputStream fos=new FileOutputStream(path))
        {
            byte[] buffer = fileFormat.getBytes();

            fos.write(buffer, 0, buffer.length);
            System.out.println("The file has been written");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

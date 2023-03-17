package Planner;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Класс хранения записей
 */
public class Diary implements PrintTo,Search {
    private final List<Note> notes;
    private String path = "X:/Geek/Developer/2_block/Java/Java/src/Planner/Diary.";
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
    public void printToFile(String format) {
        try(FileWriter fw=new FileWriter(path+format,true))
        {
            if(format.equals("xml")){
                for (Note n : notes) {
                    fw.write(new XmlFile().formatStringFile(n));
                }
            } else if (format.equals("json")) {
                for (Note n : notes) {
                    fw.write(new JsonFile().formatStringFile(n));
                }
            } else {
                for (Note n : notes) {
                    fw.write(new CsvFile().formatStringFile(n));
                }
            }
            System.out.println("The file has been written");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void searchId(int id) {
        for (Note n : notes) {
            if(n.getId()==id){
                System.out.println(n);
            }
        }
    }

    @Override
    public void searchText(String text) {
        text = String.format("\\w*%s\\w*",text);
        Pattern pattern = Pattern.compile(text, Pattern.UNICODE_CASE);
        for (Note n : notes) {
            Matcher matcher = pattern.matcher(n.getText());
            if(matcher.find()){
                System.out.println(n);
            }
        }
    }

    @Override
    public void searchPriority(Priority priority) {
        for (Note n : notes) {
            if (n.getPriority().equals(priority)){
                System.out.println(n);
            }
        }
    }
}

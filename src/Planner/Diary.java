package Planner;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Класс хранения записей
 */
public class Diary implements PrintTo,Search,AddNote {
    private final List<Note> notes;
    private String path = "X:/Geek/Developer/2_block/Java/Java/src/Planner/Diary.";
    public Diary() {
        this.notes = new ArrayList<>();
    }

    @Override
    public void addNote(Note note) {
        this.notes.add(note);
    }
    @Override
    public void addNote() throws IOException{
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст записи");
        String text = scanner.readLine();
        System.out.println("Введите автора записи");
        String person = scanner.readLine();
        System.out.println("Введите крайний срок выполнения");
        String deadline = scanner.readLine();
        System.out.println("Введите приоритет: 0-низкий, 1-средний,2-высокий");
        String importance = scanner.readLine();
        Priority priority;
        switch (importance){
            case "1":
                priority = Priority.medium;
                break;
            case "2":
                priority = Priority.high;
                break;
            default:
                priority = Priority.low;
                break;
        }
        this.notes.add(new Note(text,person,deadline,priority));
    }
    @Override
    public void printToConsole() {
        for (Note n:notes) {
            System.out.println(n);
        }
    }

    @Override
    public void printToFile() {
        Scanner scanner = new Scanner(System.in);
        String format;
        System.out.println("Введите формат файла: 1-XML,2-JSON,3-CSV");
        String line = scanner.nextLine();
        if(line.equals("1")){
            format = "xml";
        } else if(line.equals("2")){
            format = "json";
        } else format = "csv";

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
    public void searchText() throws IOException {
        System.out.println("Введите искомое слово");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
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
    public void searchPriority() throws IOException {
        System.out.println("Введите важность: 1-низкая, 2-средняя, 3-высокая");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String priorNum = br.readLine();
        String priorStr;
        if (priorNum.equals("2")){
            priorStr = "средняя";
        } else if(priorNum.equals("3")) {
            priorStr = "высокая";
        } else priorStr = "низкая";
        for (Note n : notes)
            if (n.getPriority().equals(priorStr)) {
                System.out.println(n);
            }
    }
}

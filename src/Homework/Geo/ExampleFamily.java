package Homework.Geo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class ExampleFamily implements Out, FamilyTree, Search, Comparable<Person> {
    private TreeSet<Node> tree = new TreeSet<>();

    @Override
    public void append(Person person1,Relationship re1, Person person2, Relationship re2){
            tree.add(new Node(person1, re2, person2));
            tree.add(new Node(person2,re1, person1));
    }

    @Override
    public void printToConsole(String data) {
        System.out.println(data);
    }

    @Override
    public void saveFile(String data, String path){
        try(FileOutputStream fos=new FileOutputStream(path + LocalDate.now()))
        {
            byte[] buffer = data.toString().getBytes();

            fos.write(buffer, 0, buffer.length);
            System.out.println("The file has been written");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    public String searchRelation(Person person, Relationship relationship) {
        ArrayList<String> result = new ArrayList<>();
        for (Node t : tree) {
            if (t.person1.getFullName().equals(person.getFullName()) && t.relationship.equals(relationship)) {
                result.add(t.person2.getFullName());
            }
        }
        return result.toString();
    }
    @Override
    public String bornAfterDate(LocalDate date){
        HashSet<String> result = new HashSet<>();
        for (Node t : tree) {
            if(t.person1.getBirthDay().isAfter(date)){
                result.add(t.person1.getFullName());
            }
            if(t.person2.getBirthDay().isAfter(date)){
                result.add(t.person2.getFullName());
            }
        }
        return result.toString();
    }
    @Override
    public String getGender(String gender){
        HashSet<String> result = new HashSet<>();
        for (Node t : tree) {
            if (t.person1.getGender().equals(gender)){
                result.add(t.person1.getFullName());
            }
            if (t.person2.getGender().equals(gender)){
                result.add(t.person2.getFullName());
            }
        }
        return result.toString();
    }
    public String getTree(){
        ArrayList<String> result = new ArrayList<>();
        for (Node t: tree) {
           result.add(t.relationship +" -> "+ t.person1.getFullName() + " / " + t.person1.getBirthDay() + "\n");
        }
        return result.toString();
    }

    @Override
    public int compareTo(Person person) {
        return person.getFullName().compareTo(String.valueOf(person.getBirthDay()));
    }
}

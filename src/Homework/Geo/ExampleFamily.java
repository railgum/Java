package Homework.Geo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class ExampleFamily implements Out, FamilyTree, Search {
    private ArrayList<Node> tree = new ArrayList<>();

    @Override
    public void append(Person person1, Person person2, Relationship relationship){
/*
        if(relationship == Relationship.parent){
            tree.add(new Node(person1, Relationship.children, person2));
            tree.add(new Node(person2, Relationship.parent, person1));
        } else if(relationship == Relationship.children){
            tree.add(new Node(person1, Relationship.parent, person2));
            tree.add(new Node(person2, Relationship.children, person1));
        }
*/
        tree.add(new Node(person1,relationship,person2));
    }
    @Override
    public void appendBrotherSister(Person person1, Person person2){
        if(person1.getGender()=="male" && person2.getGender()=="male"){
            tree.add(new Node(person1, Relationship.brother,person2));
            tree.add(new Node(person2, Relationship.brother,person1));
        } else if (person1.getGender()=="male" && person2.getGender()=="female") {
            tree.add(new Node(person1,Relationship.sister,person2));
            tree.add(new Node(person2,Relationship.brother,person1));
        }else if (person1.getGender()=="female" && person2.getGender()=="female") {
            tree.add(new Node(person1,Relationship.sister,person2));
            tree.add(new Node(person2,Relationship.sister,person1));
        }else if (person1.getGender()=="female" && person2.getGender()=="male") {
            tree.add(new Node(person1,Relationship.brother,person2));
            tree.add(new Node(person2,Relationship.sister,person1));
        }
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
            if (t.person1.getFullName() == person.getFullName() && t.relationship == relationship) {
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
            if (t.person1.getGender() == gender){
                result.add(t.person1.getFullName());
            }
            if (t.person2.getGender() == gender){
                result.add(t.person2.getFullName());
            }
        }
        return result.toString();
    }


}

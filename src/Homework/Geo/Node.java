package Homework.Geo;

public class Node {

    public Node(Person person1, Relationship relationship, Person person2) {
        this.person1 = person1;
        this.person2 = person2;
        this.relationship = relationship;
    }

    Person person1;
    Relationship relationship;
    Person person2;


    @Override
    public String toString() {
        return String.format("<%s %s %s>", person1, relationship, person2);
    }

}

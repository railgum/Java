package Lesson_1.Homework.Geo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reserch {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
//        System.out.println(tree.size());
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                result.add(t.p2.fullName);
            }
        }
        //System.out.println(result.size());
        return result;
    }
    public LocalDate bd(Person p){
        return p.getBirthDay();
    }

}

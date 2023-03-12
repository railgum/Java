import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person p1, Person p2, Relationship re) {
        switch (re){
            case children -> {
                tree.add(new Node(p1, Relationship.children, p2));
                tree.add(new Node(p2, Relationship.parent, p1));
            }
            case parent -> {
                tree.add(new Node(p2, Relationship.children, p1));
                tree.add(new Node(p1, Relationship.parent, p2));
            }
            case sister -> {
                tree.add(new Node(p1, Relationship.brother, p2));
            }
            case brother -> {
                tree.add(new Node(p1, Relationship.sister, p2));
            }
        }

    }

}

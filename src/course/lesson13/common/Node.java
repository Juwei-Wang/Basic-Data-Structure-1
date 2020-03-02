package course.lesson13.common;

import java.util.ArrayList;

public class Node {
    private String name;

    public Node() {
    }

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private ArrayList<Node> nodes = new ArrayList<>();

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    public void connect(Node node) {
        // this: 203    // n1
        // node: 205    // n2
        this.nodes.add(node);
        node.nodes.add(this);
    }

    // create an edge between n1 and n2
    public static void connectNodes(Node n1, Node n2) {
        // this: 203
        // node: 205
        n1.nodes.add(n2);
        n2.nodes.add(n1);
    }

    @Override
    public String toString() {
        return name + "(" + distance + ")";
    }

    public boolean visited;

    public int distance;

    public Node from;
}

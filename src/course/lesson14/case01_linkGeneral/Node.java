package course.lesson14.case01_linkGeneral;

import java.util.ArrayList;
import java.util.List;

public class Node {
    String name;

    public Node() {
    }

    public Node(String name) {
        this.name = name;
    }

    Node parent;
    List<Node> subNodes = new ArrayList<>();


    public void addSubNode(Node node) {
        this.subNodes.add(node);
        node.parent = this;
    }


    @Override
    public String toString() {
        return name;
    }
}

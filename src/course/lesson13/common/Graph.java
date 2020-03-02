package course.lesson13.common;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<Node> nodes = new ArrayList<>();

    public void addNode(Node node) {
        nodes.add(node);
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public static Graph buildDemo() {
        Graph graph = new Graph();
        Node n1 = new Node("1");
        Node n2 = new Node("2");
        Node n3 = new Node("3");
        Node n4 = new Node("4");
        Node n5 = new Node("5");
        Node n6 = new Node("6");
        Node.connectNodes(n1, n2);
        Node.connectNodes(n1, n3);
        Node.connectNodes(n3, n4);
        Node.connectNodes(n4, n5);
        Node.connectNodes(n4, n6);
        Node.connectNodes(n5, n6);
        graph.addNode(n3);
        graph.addNode(n1);
        graph.addNode(n2);
        graph.addNode(n4);
        graph.addNode(n5);
        graph.addNode(n6);
        return graph;
    }
}

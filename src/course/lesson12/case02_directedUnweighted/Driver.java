package course.lesson12.case02_directedUnweighted;

public class Driver {
    public static void main(String[] args) {
        Graph graph = new Graph();
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        graph.addNode(a);
        graph.addNode(b);
        graph.addNode(c);
        graph.addNode(d);
        graph.addNode(e);

        // 203.connect(205)
//        a.connect(b);
        Node.connectNodes(a, b);

        b.connect(c);
        c.connect(d);
        b.connect(d);
        c.connect(e);
        d.connect(e);

        System.out.println();
    }
}

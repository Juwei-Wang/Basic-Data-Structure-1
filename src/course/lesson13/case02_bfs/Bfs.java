package course.lesson13.case02_bfs;

import course.lesson13.common.Graph;
import course.lesson13.common.Node;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Bfs {
    public static List<Node> bfs(Graph graph) {
        Node initialNode = graph.getNodes().get(0);
        initialNode.distance = 0; // shortest path distance

        HashSet<Node> infectedNodes = new HashSet<>();

        LinkedList<Node> waitingNodes = new LinkedList<>();
        waitingNodes.addLast(initialNode);
        infectedNodes.add(initialNode);

        ArrayList<Node> sequence = new ArrayList<>();

        while (!waitingNodes.isEmpty()) {
            Node node = waitingNodes.removeFirst();
            sequence.add(node);
            System.out.println(node);

            ArrayList<Node> subNodes = node.getNodes();
            for (Node subNode : subNodes) {
                if (infectedNodes.contains(subNode)) {
                    continue;
                }
                waitingNodes.addLast(subNode);
                infectedNodes.add(subNode);
                subNode.distance = node.distance + 1;
            }
        }
        return sequence;
    }

    public static void main(String[] args) {
        Graph graph = Graph.buildDemo();
        List<Node> sequence = bfs(graph);
        System.out.println(sequence);
    }
}

package course.lesson13.case01_dfs;

import course.lesson13.common.Graph;
import course.lesson13.common.Node;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Dfs {

    public static List<Node> dfs(Graph graph) {
        dfs(graph.getNodes().get(0));
        return sequence;
    }

    private static HashSet<Node> nodes = new HashSet<>();
    private static List<Node> sequence = new ArrayList<>();

    public static void dfs(Node node) {
        // option 1
//        if(node.visited) {
//            return;
//        }
//        node.visited = true;

        // option 2
        if (nodes.contains(node)) {
            return;
        }
        nodes.add(node);

        // collect
        sequence.add(node);

        System.out.println(node);
        ArrayList<Node> subNodes = node.getNodes();
        for (Node subNode : subNodes) {
            dfs(subNode);
        }
    }

    public static void main(String[] args) {
        Graph graph = Graph.buildDemo();
        List<Node> sequence = dfs(graph);
        System.out.println(sequence);
    }
}

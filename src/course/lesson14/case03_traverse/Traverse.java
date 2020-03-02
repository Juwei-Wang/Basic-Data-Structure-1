package course.lesson14.case03_traverse;

import java.util.ArrayList;
import java.util.List;

public class Traverse {

    private static List<Node> sequence;

    // self, left, self, right, self
    // rec   f(l)        f(r)             preorder
    //       f(l)  rec   f(r)             inorder
    //       f(l)        f(r)   ref       postorder

    public static List<Node> preOrder(Node node) {
        sequence = new ArrayList<>();
        preOrderRecursion(node);
        return sequence;
    }
    private static void preOrderRecursion(Node node) {
        if (node == null) {
            return;
        }
        sequence.add(node);
        preOrderRecursion(node.left);
        preOrderRecursion(node.right);
    }


    public static List<Node> inOrder(Node node) {
        sequence = new ArrayList<>();
        inOrderRecursion(node);
        return sequence;
    }
    private static void inOrderRecursion(Node node) {
        if (node == null) {
            return;
        }
        inOrderRecursion(node.left);
        sequence.add(node);
        inOrderRecursion(node.right);
    }

    public static List<Node> postOrder(Node node) {
        sequence = new ArrayList<>();
        postOrderRecursion(node);
        return sequence;
    }
    private static void postOrderRecursion(Node node) {
        if (node == null) {
            return;
        }
        postOrderRecursion(node.left);
        postOrderRecursion(node.right);
        sequence.add(node);
    }
}

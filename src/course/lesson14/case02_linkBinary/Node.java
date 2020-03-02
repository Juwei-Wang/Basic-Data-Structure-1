package course.lesson14.case02_linkBinary;

public class Node {
    String name;

    Node parent;

    Node left;
    Node right;

    public Node() {
    }

    public Node(String name) {
        this.name = name;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
        left.parent = this;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
        right.parent = this;
    }
}

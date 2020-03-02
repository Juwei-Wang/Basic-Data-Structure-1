package course.lesson14.case02_linkBinary;

public class Driver {
    public static void main(String[] args) {
        Node n1 = new Node("1");
        Node n2 = new Node("2");
        Node n3 = new Node("3");
        Node n4 = new Node("4");
        Node n5 = new Node("5");
        Node n6 = new Node("6");

        n1.setLeft(n2);
        n2.setLeft(n4);
        n1.setRight(n3);
        n3.setLeft(n5);
        n3.setRight(n6);

        Node root = n1;

        System.out.println();

    }
}

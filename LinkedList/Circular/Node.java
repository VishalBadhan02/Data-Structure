package LinkedList.Circular;

public class Node {
    int data;
    Node next, prev;

    public Node(int data) {
        this.data = data;
        prev = next = null;
    }

    public void forwardtraversing(Node next) {
        Node current = next;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Node node = null;
        node = new Node(20);
        Node node1 = new Node(30);
        Node node2 = new Node(40);
        Node node3 = new Node(50);

        node.next = node1;
        node1.prev = node;
        node1.next = node2;
        node2.prev = node1;
        node2.next = node3;
        node3.prev = node2;
        node3.next = node;
        node.forwardtraversing(node);
    }
}

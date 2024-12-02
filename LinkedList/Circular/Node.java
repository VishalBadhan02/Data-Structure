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
            System.out.println("data " + current.data);
            current = current.next;
            if (current.prev == null)
                break;
        }
    }

    static Node insertionInEmpty(Node next, int data) {
        if (next != null)
            return next;

        Node newNode = new Node(data);

        newNode.next = newNode;
        next = newNode;
        return next;
    }

    static Node insertionInBegning(Node next, int data) {
        Node newNode = new Node(data);
        if (next != null) {
            newNode.next = next;
            next.next = newNode;
        }
        return newNode;

    }

    public static void main(String[] args) {
        Node node = null;
        node = insertionInEmpty(node, 10);
        // Node node1 = new Node(20);
        // node.next = node1;
        // node1.prev = node;
        // node1.next = node;
        node = insertionInBegning(node, 20);
        // Node node1 = new Node(30);
        // Node node2 = new Node(40);
        // Node node3 = new Node(50);

        // node.next = node1;
        // node1.prev = node;
        // node1.next = node2;
        // node2.prev = node1;
        // node2.next = node3;
        // node3.prev = node2;
        // node3.next = node;
        node.forwardtraversing(node);
    }
}

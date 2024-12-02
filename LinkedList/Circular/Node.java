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
        do {
            System.out.println("data " + current.data);
            current = current.next;
        } while (current != next);

    }

    static Node insertionInEmpty(Node next, int data) {
        if (next != null)
            return next;

        Node newNode = new Node(data);

        newNode.next = newNode;
        next = newNode;
        return next;
    }

    static Node insertionInbegning(Node next, int data) {
        Node newNode = new Node(data);

        Node current = next;
        while (current.next != next) {
            current = current.next;
        }

        if (next != null) {
            newNode.next = next;
            current.next = newNode;
            next = newNode;
        }
        return newNode;

    }

    static void insertionAtEnd(Node next, int data) {
        Node newNode = new Node(data);

        Node last = next;

        while (last.next != next) {
            last = last.next;
        }

        newNode.next = last.next;
        last.next = newNode;
    }

    static void insertionAtRandom(Node next, int data, int position) {
        if (position < 1) {
            return;
        }

        Node newNode = new Node(data);

        Node current = next;
        while (current.next != next) {
            current = current.next;
        }

        if (position == 1) {
            newNode.next = next;
            current.next = newNode;
        }

        int count = 0;
        Node last = next;
        while (last.next != next && count < position - 1) {
            last = last.next;
            count++;
        }

        newNode.next = last.next;
        last.next = newNode;

    }

    public static void main(String[] args) {
        Node node = null;
        node = insertionInEmpty(node, 30);
        node = insertionInbegning(node, 20);
        node = insertionInbegning(node, 10);
        insertionAtEnd(node, 40);
        insertionAtRandom(node, 25, 2);
        node.forwardtraversing(node);

    }
}

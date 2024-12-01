package LinkedList.Doubly;

public class Node {
    int data;
    Node pre;
    Node next;

    public Node(int data) {
        this.data = data;
        pre = next = null;
    }

    public Node forwardtraversing(Node next) {
        Node current = next;
        int count = 1;
        while (current != null) {
            System.out.println("Node " + count + " Data " + current.data);
            current = current.next;
            count++;
        }
        return current;
    }

    public void backwordtraversing(Node pre) {
        Node current = pre;
        int count = 1;
        while (current != null) {
            System.out.println("Node " + count + " Data " + current.data);
            current = current.pre;
            count++;
        }
    }

    public Node insertAtBegning(Node next, int data) {

        Node newNode = new Node(data);

        Node current = next;
        newNode.next = current;

        return newNode;

    }

    public void insertAtEnd(Node next, int data) {

        Node newNode = new Node(data);

        Node current = next;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.pre = current;

    }

    public Node insertAtRandom(Node next, int data, int position) {
        Node newNode = new Node(data);

        if (position < 1) {
            return next;
        }

        if (position == 1) {
            next.pre = newNode;
            newNode.next = next;
            return newNode;
        }
        int count = 1;
        Node current = next;
        while (current.next != null && count < position - 1) {
            current = current.next;
            count++;
        }

        if (current.next == null) {
            current.next = newNode;
            newNode.pre = current;
        }
        newNode.next = current.next;
        current.next = newNode;
        newNode.pre = current;
        return next;

    }

    public Node removeAtstart(Node next) {
        Node current = next;
        next = next.next;

        if (current != null) {
            current = null;
        }
        return next;

    }

    public void removeAtEnd(Node next) {
        Node current = next;

        while (current.next != null) {
            current = current.next;
        }

        Node previous = current.pre;
        if (previous != null) {
            previous.next = null;
        }
    }

    public Node removeAtRandom(Node next, int position) {
        Node current = next;

        if (position < 1) {
            System.out.println("invalid positon");
            return next;
        }

        if (position == 1) {
            next = next.next;
            current = null;
            return next;
        }

        int count = 1;
        while (current.next != null && count < position - 1) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
        return next;
    }

    public static void main(String args[]) {
        Node node = null;
        node = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        Node node3 = new Node(40);

        node.next = node1;
        node1.pre = node;
        node1.next = node2;
        node2.pre = node1;
        node2.next = node3;
        node3.pre = node2;

        node = node.insertAtBegning(node, 5);
        node.insertAtEnd(node, 50);
        node = node.insertAtRandom(node, 25, 4);
        node = node.removeAtstart(node);
        node.removeAtEnd(node);
        node = node.removeAtRandom(node, 2);

        node = node.forwardtraversing(node);
        // node.backwordtraversing(node3);

    }
}

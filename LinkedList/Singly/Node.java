package LinkedList.Singly;

public class Node {
    int data = 1;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public void traverseLinkedList() {
        Node current = this;
        int count = 0;

        while (current != null) {
            count++;
            System.out.println("Node " + count + " data " + current.data);
            current = current.next;
        }
    }

    public void searchLinkedList(Node next, int target) {
        Node current = next;
        int count = 0;

        while (current != null) {
            count++;
            // System.out.println(target + " and value : " + current.data);
            if (current.data == target) {
                System.out.println("Searching done target value founded : " + target);
                break;
            } else {
                System.out.println("target value not matched with node : " + count);
                current = current.next;
            }

        }
    }

    public Node insertAtBegning(Node next, int value) {
        Node newNode = new Node(value);
        newNode.next = next;
        return newNode;
    }

    public void insertAtEnd(Node next, int value) {
        if (next == null) {
            return;
        }
        Node newNode = new Node(value);

        Node current = next;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;

    }

    public Node insertAtRandomlocation(Node next, int position, int value) {
        if (position < 1) {
            System.out.println("Invalid positon");
            return next;
        }
        Node newNode = new Node(value);

        if (position == 1) {
            newNode.next = next;
            return newNode;
        }

        Node current = next;
        int count = 1;
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Position out of range");
            return next;
        }

        newNode.next = current.next;
        current.next = newNode;

        return next;
    }

    public void removeFirstNode(Node next) {

    }

    public static void main(String args[]) {
        Node node = new Node(10);
        Node node1 = new Node(20);
        Node node3 = new Node(30);

        node.next = node1;
        node1.next = node3;
        // node.searchLinkedList(node, 20);
        node = node.insertAtBegning(node, 5);
        node.insertAtEnd(node, 40);
        node = node.insertAtRandomlocation(node, 3, 25);
        node.traverseLinkedList();

    }
}

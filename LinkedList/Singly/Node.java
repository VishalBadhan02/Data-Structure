package LinkedList.Singly;

public class Node {
    int data = 1;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static void main(String args[]) {
        Node node = new Node(10);
        Node node1 = new Node(20);
        Node node3 = new Node(30);

        node.next = node1;
        node1.next = node3;

        Node current = node;
        int count = 0;

        while (current != null) {
            count++;
            System.out.println("Node " + count + " data " + current.toString());
            current = current.next;
        }

        // if (node.next != null) {
        // System.out.println("First node's next is linked to: " + node.next.data);
        // } else {
        // System.out.println("First node's next is not linked.");
        // }
        // System.out.println("First node data: " + node.data);
    }
}

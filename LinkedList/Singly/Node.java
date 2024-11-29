package LinkedList.Singly;

public class Node {
    int data = 1;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public void traverseLinkedList(Node next) {
        Node current = next;
        while (current != null) {
            
        }
    }

    public static void main(String args[]) {
        Node node = new Node(10);
        Node node1 = new Node(20);
        Node node3 = new Node(30);

        node.next = node1;
        node1.next = node3;

        if (node.next != null) {
            System.out.println("First node's next is linked to: " + node.next.data);
        } else {
            Node current = node;
            int count = 0;

            while (current != null) {
                count++;
                System.out.println("Node " + count + " data " + current.data);
                current = current.next;
            }
        }
    }
}

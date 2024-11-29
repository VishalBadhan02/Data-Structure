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
        int count = 0;

        while (current != null) {
            count++;
            System.out.println("Node " + count + " data " + (current.data + 1));
            current = current.next;
        }
    }

    public void searchLinkedList(Node next, int target) {
        Node current = next;

        while (current != null) {
            // System.out.println(target + " and value : " + current.data);
            if (current.data == target) {
                System.out.println("Searching done target value founded : " + target);
                break;
            } else {
                System.out.println("value not found");
            }
            current = current.next;
        }
    }

    public static void main(String args[]) {
        Node node = new Node(10);
        Node node1 = new Node(20);
        Node node3 = new Node(30);

        node.next = node1;
        node1.next = node3;
        node.traverseLinkedList(node);
        node.searchLinkedList(node, 10);

    }
}

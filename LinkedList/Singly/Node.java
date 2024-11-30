package LinkedList.Singly;

public class Node {
    int data = 1;
    Node next;

    // Assigining the values in the list
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    // traversing the list
    public void traverseLinkedList() {
        Node current = this;
        int count = 0;

        while (current != null) {
            count++;
            System.out.println("Node " + count + " data " + current.data);
            current = current.next;
        }
    }

    // Searching in the list
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

    // Insertion in the begning of the list
    public Node insertAtBegning(Node next, int value) {
        Node newNode = new Node(value);
        newNode.next = next;
        return newNode;
    }

    // Insertion in the end of the list
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

    // Insertion in the random location of the list
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

    // Removing the firstelements of the list
    public Node removeFirstNode(Node next) {
        if (next == null) {
            return next;
        }

        Node current = next;
        next = current.next;
        return next;
    }

    // Removing the lastelements of the list
    public void removeLastNode(Node next) {
        if (next == null) {
            return;
        }

        if (next.next == null) {
            next = null;
            return;
        }

        Node current = next;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // Removing element at random postion of the lis
    public void removeAtPosition(Node next, int postion) {
        if (postion < 1) {
            return;
        }

        // this will not work because new node will start from here and i am using void
        // rather then Node so it is not returning any new node to the method
        if (postion == 1) {
            Node temp = next;
            next = next.next;
            temp = null;
            return;
        }

        Node current = next;
        int count = 1;
        while (current != null && count < postion - 1) {
            current = current.next;
            count++;
        }

        if (current == null || current.next == null) {
            System.out.println("position is invalid");
            return;
        }

        current.next = current.next.next;
    }

    public static void main(String args[]) {
        Node node = new Node(10);
        Node node1 = new Node(20);
        Node node3 = new Node(30);

        node.next = node1;
        node1.next = node3;
        node.searchLinkedList(node, 20);
        node = node.insertAtBegning(node, 5);
        node.insertAtEnd(node, 40);
        node = node.insertAtRandomlocation(node, 4, 25);
        // node = node.removeFirstNode(node);
        // node.removeLastNode(node);
        node.removeAtPosition(node, 1);
        node.traverseLinkedList();

    }
}

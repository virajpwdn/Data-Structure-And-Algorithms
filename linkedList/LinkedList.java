package linkedList;

public class LinkedList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        // 1. Create New Node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // 2. newNode.next = head
        newNode.next = head; /* Link */
        // 3. head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        // 1. Create new Node
        Node newNode = new Node(data);
        if(head == null && tail == null){
            
        }

        // 2. update tail.next from null to newNode
        tail.next = newNode;

        // 3. Shift Tail to newNode
        tail = newNode;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
    }
}

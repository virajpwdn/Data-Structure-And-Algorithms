class Node {
    int val;
    Node next;

    public Node() {
        this.val = 0;
        this.next = null;
    }

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class MyLinkedList {
    private Node head;
    private int size;

    public MyLinkedList() {
        head = new Node();
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        
        Node current = head.next;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        
        return current.val;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head.next;  
        head.next = newNode;      
        size++;
    }

    public void addAtTail(int val) {
        Node current = head;
        Node newNode = new Node(val);
        
        while (current.next != null) {
            current = current.next;
        }
        
        current.next = newNode;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;
        
        Node current = head;
        Node newNode = new Node(val);
        
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        
        Node current = head;
        
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        
        current.next = current.next.next;
        size--;
    }
}
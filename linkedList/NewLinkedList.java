package linkedList;

public class NewLinkedList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;
    public int size = 0;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            // newNode.next = null; /* This is optional because by default new node next is
            // set to null */
            tail = newNode;
        }
        size++;
    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int idx = 0;
        Node temp = head;
        while (idx != size - 2) {
            temp = temp.next;
            idx++;
        }
        int val = tail.data;
        tail = temp;
        tail.next = null;
        size--;
        return val;
    }

    public void insertBetween(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        if (idx < 0) {
            System.out.println("Invalid Insertation");
            return;
        }
        if (idx > size) {
            addLast(data);
            return;
        }
        if (head == null) {
            addFirst(data);
            return;
        }
        
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        Node nextData = temp.next;
        temp.next = newNode;
        newNode.next = nextData;
        size++;
    }

    public int deleteBetween(int idx){
        if(idx > size || idx < 0){
            System.out.println("Invalid Index");
            return -1;
        }
        if(head == null){
            System.out.println("LinkedList is empty");
            return -1;
        } else if(size == 1){
            if(idx == size){
                int val = head.data;
                head = tail = null;
                size --;
                return val;
            }else{
                System.out.println("Invalid Index");
                return -1;
            }
        }
        if(idx == 0){
            int val = head.data;
            removeFirst();
            return val;
        }
        Node temp = head;
        for (int i = 0; i < idx-1; i++) {
            temp = temp.next;
        }
        int val = temp.data;
        temp.next = temp.next.next;
        size--;
        return val;
    }

    public void print() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        NewLinkedList ll = new NewLinkedList();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        // System.out.println(ll.removeLast());
        // System.out.println(ll.removeLast());
        ll.insertBetween(2, 12);
        ll.print();
        ll.deleteBetween(6);
        ll.print();
        System.out.println("The size of the linked list is " + ll.size);
    }
}

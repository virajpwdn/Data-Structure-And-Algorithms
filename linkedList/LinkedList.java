package linkedList;

public class LinkedList {
    // Every node is a object
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    public void addFirst(int data) {
        // 1. Create New Node
        Node newNode = new Node(data);
        size++;
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
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // 2. update tail.next from null to newNode
        tail.next = newNode;

        // 3. Shift Tail to newNode
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        if (temp == null) {
            System.out.println("LL is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addInMiddle(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            i++;
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LinkedList is empty!");
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
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
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data; /*-> we can also write val = tail.data ==> because when there is only 1 node in LL that node is only head and tail */
            head = tail = null;
            size--;
            return val;
        }
        int i = 0;
        Node prev = head;
        while (i < size - 2) {
            prev = prev.next;
            i++;
        }
        int val = tail.data; /*-> can also write prev.next.data ==> it point towards tail node */
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int iterativeSearch(int key) {
        if (head == null) {
            return -1;
        } else if (size == 1) {
            int val = head.data;
            if (val == key)
                return 1;
            else
                return -1;
        }

        Node temp = head;
        for (int i = 0; i < size; i++) {
            int val = temp.data;
            if (val == key)
                return i;
            temp = temp.next;
        }
        return -1;
    }

    public int recersiveSearch(Node node, int key, int idx) {
        if (node == null)
            return Integer.MIN_VALUE;
        else if (size == 1) {
            if (node.data == key)
                return 0;
            else
                return -1;
        }
        // Base case
        if (idx == size) {
            return -1;
        }

        if (node.data == key) {
            return idx;
        }
        return recersiveSearch(node.next, key, idx + 1);
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addFirst(12);
        ll.addInMiddle(4, 8);
        ll.addInMiddle(2, 9);
        ll.print();

        ll.removeFirst();

        ll.removeLast();
        ll.print();
        System.out.println(ll.size);
        System.out.println(ll.iterativeSearch(4));
        System.out.println(ll.recersiveSearch(ll.head,9, 0));
    }
}

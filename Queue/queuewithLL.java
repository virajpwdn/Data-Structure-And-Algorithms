package Queue;

public class queuewithLL {
    static class Node{
        int val;
        Node next = null;

        public Node(int val){
            this.val = val;
        }
    }

    static class Queue{
        static Node front = null;
        static Node rear = null;
        static int size = 0;

        public static boolean isEmpty(){
            return front == null;
        }

        public static void enqueue(int val){
            Node newNode = new Node(val);
            size++;
            if(isEmpty()) {
                front = rear = newNode;
                return;
            }

            rear.next = newNode;
            rear = newNode;
            return;
        }

        public static int dequeue(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            if (size == 1) {
                int remove = front.val;
                front = rear = null;
                size--;
                return remove;
            }

            int remove = front.val;
            front = front.next;
            size--;
            return remove;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int val = front.val;
            return val;
        }

        public static void display(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }

            Node temp = front;
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
            return;
        }
    }

    public static void main(String[] args) {
        Queue.enqueue(5);
        Queue.enqueue(6);
        Queue.enqueue(7);
        Queue.enqueue(8);

        Queue.dequeue();
        // Queue.display();

        System.out.println(Queue.peek());
    }
}

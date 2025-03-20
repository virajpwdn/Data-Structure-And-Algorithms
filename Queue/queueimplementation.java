package Queue;

public class queueimplementation {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        public Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        public static void enqueue(int val){
            if (rear == size -1) {
                System.out.println("Array is full");
                return;
            }

            rear = rear + 1;
            arr[rear] = val;
        }

        public static int dequeue(){
            if(rear == -1) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = arr[0];
            for (int j = 0; j < rear; j++) {
                arr[j] = arr[j+1];
            }
            rear = rear - 1;
            return front;
        }

        public static int peek(){
            if (rear == -1) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = arr[0];
            return front;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(9);
        q.enqueue(8);
        q.enqueue(5);
        q.enqueue(4);

        // System.out.println(q.peek());
        // System.out.println(q.dequeue());

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}

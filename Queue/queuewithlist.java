package Queue;

import java.util.ArrayList;

public class queuewithlist {
    static class Queue{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void enqueue(int val) {
            list.add(val);
        }

        public static int dequeue(){
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            int front = list.get(0);
            list.remove(list.get(0));
            return front;
        }

        public static int peek(){
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            int front = list.get(0);
            return front;
        }

        public static void display(){
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }

            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
            return;
        }
    }

    public static void main(String[] args) {
        Queue.enqueue(1);
        Queue.enqueue(2);
        Queue.enqueue(3);
        Queue.enqueue(4);

        Queue.dequeue();
        // Queue.display();
        System.out.println(Queue.peek());
    }
}

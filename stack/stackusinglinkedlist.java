package stack;

import java.util.ArrayList;

public class stackusinglinkedlist {
    static class Node {
        int data;
        Node next = null;

        public Node(int data) {
            this.data = data;
        }
    }

    static class Stack {
        public static int size = 0;

        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static int peek() {
            if (head == null)
                return -1;
            int top = head.data;
            return top;
        }

        public static void push(int val) {
            Node newNode = new Node(val);
            size++;
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
            return;
        }

        public static int pop() {
            if (head == null)
                return -1;
            int top = head.data;
            head = head.next;
            size--;
            return top;
        }

        public static void display() {
            if (head == null) {
                System.out.print("Stack is empty");
                return;
            }
            Node top = head;
            while (top != null) {
                System.out.print(top.data + " -> ");
                top = top.next;
            }
            System.out.println("null");
        }

    }

    public static void main(String[] args) {
        Stack sk = new Stack();
        sk.push(1);
        sk.push(2);
        sk.push(3);
        sk.push(4);


        sk.display();
        System.out.println(sk.size);
    }
}

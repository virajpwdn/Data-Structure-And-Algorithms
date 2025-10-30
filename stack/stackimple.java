package stack;

import java.util.ArrayList;

public class stackimple {
    static class Stack {
        static ArrayList <Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(int val){
            list.add(val);
        }

        public static int pop(){
            if(list.isEmpty()) return -1;
            int top = list.remove(list.size()-1);
            return top;
        }

        public static int peek(){
            return list.get(list.size() - 1);
        }
    }
    public static void main(String[] args) {
        Stack sk = new Stack();
        sk.push(1);
        sk.push(2);
        sk.push(3);

        // while (!sk.isEmpty()) {
        //     System.out.println(sk.peek());
        //     sk.pop();
        // }

        sk.pop();
        System.out.println(sk.peek());

        System.out.println(sk.isEmpty());
    }
}
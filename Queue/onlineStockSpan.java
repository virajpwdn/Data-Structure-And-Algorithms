package Queue;

import java.util.Stack;

public class onlineStockSpan {

    class StockSpanner {
        static class Pair {
            int first;
            int second;

            Pair(int first, int second) {
                this.first = first;
                this.second = second;
            }
        }

        Stack<Pair> sk;
        int idx;

        public StockSpanner() {
            sk = new Stack<>();
            idx = -1;
        }

        public int next(int price) {
            idx = idx + 1;
            while (!sk.isEmpty() && sk.peek().first <= price) {
                sk.pop();

            }
            int ans = sk.isEmpty() ? idx + 1 : idx - sk.peek().second;
            sk.push(new Pair(price, idx));
            return ans;
        }
    }
}
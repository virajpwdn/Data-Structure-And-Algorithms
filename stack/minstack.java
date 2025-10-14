import java.util.ArrayList;

public class minstack {
    class MinStack {
        class Pair {
            int val;
            int min;

            public Pair(int val, int min) {
                this.val = val;
                this.min = min;
            }
        }

        private ArrayList<Pair> list;

        public MinStack() {
            list = new ArrayList<>();

        }

        public void push(int val) {
            int min = val;
            if (list.size() != 0) {
                int lastMin = list.get(list.size() - 1).min;
                min = Math.min(lastMin, min);
            }
            list.add(new Pair(val, min));
        }

        public void pop() {
            if (list.size() == 0)
                return;
            list.remove(list.size() - 1);
        }

        public int top() {
            if (list.size() == 0)
                return -1;
            return list.get(list.size() - 1).val;
        }

        public int getMin() {
            if (list.size() == 0)
                return -1;
            return list.get(list.size() - 1).min;
        }
    }
}

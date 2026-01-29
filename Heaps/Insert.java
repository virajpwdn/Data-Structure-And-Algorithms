import java.util.ArrayList;
/*
    1
    last idx add
    length++
    heapify(i)
    
    heapify() {
        while(i > 0) {
            getParentIdx(i)
            if(parentIdx > i) {
                swap
            }else break;
            
            i = parentIdx;
        }
    }
*/

class MinHeap {
    ArrayList<Integer> arr;
    static int length;
    
    public MinHeap() {
        length = 0;
        this.arr = new ArrayList<>();
    }
    
    public int getLeftIdx(int i) {
        return (2 * i) + 1;
    }
    
    public int getRightIdx(int i) {
        return (2 * i) + 2;
    }
    
    public int getParentIdx(int i) {
        return (i - 1) / 2;
    }
    
    public void insert(int val) {
        arr.add(val);
        length++;
        heapifyUp(arr.size()-1);
    }
    
    public void swap(int parentIdx, int length) {
        int temp = arr.get(parentIdx);
        arr.set(parentIdx, arr.get(length));
        arr.set(length, temp);
    }
    
    public void heapifyUp(int i) {
        while(i > 0) {
            int parentIndex = this.getParentIdx(i);
            if(arr.get(parentIndex) > arr.get(i)) {
               swap(parentIndex, i);
            }else break;
            
            i = parentIndex;
        }
    }
    
    public void printHeap() {
        System.out.println(arr);
    }
}

// 1. Parent Element should be less then children element
// 2. Must be a complete binary tree

class Heap {
    // Insert a Node in heap
        // 1. Add element at last index
        // 2. Compare last added node with parent node
        // 3. if parent node is greater then child then do swap (Heapify)

        ArrayList<Integer> list;
        int length;
        public Heap() {
            this.list = new ArrayList<>();
            this.length = 0;
        }

        public int getLeftIdx(int i) {
            return (2 * i) + 1;
        }

        public int getRightIdx(int i) {
            return (2 * i) + 2;
        }

        public int getParentIdx(int i) {
            return (i-1)/2;
        }

        public void insert(int val) {
            this.list.add(val);
            this.length++;
            heapify(length);
        }

        public void swap(int parentIdx, int childIdx) {
            int temp = list.get(parentIdx);
            list.set(parentIdx, list.get(childIdx));
            list.set(childIdx, temp);
        }

        public void heapify(int i) {
            while(i > 0) {
                int parentIdx = getParentIdx(i);
                if(list.get(parentIdx) > list.get(i)) {
                    swap(parentIdx, i);
                }else break;

                i = parentIdx;
            }
        }


        // Delete a Node
        /* A node in heap can only be removed from top
            After removing the node the heap should be self balancing
            
            1. copy last node val to first node
            2. remove the last node
            3. heapify down - Parent Node should be less then Child Node 
         */

         public void heapifyDown(int i) {
            int n = list.size();
            while(i < list.size()) {
                if(list.size() < 1) return;

                int leftNode = getLeftIdx(i);
                int rightNode = getRightIdx(i);

                int small = i;
                if(leftNode < n && list.get(small) > list.get(leftNode)) small = leftNode;
                if(rightNode < n && list.get(small) > list.get(rightNode)) small = rightNode;

                if(small != i) {
                    swap(small, i);
                }else break;

                i = small;
            }
        }

        public void removeNode() {
            int lastNode = list.get(list.size() - 1);
            swap(0, list.size()-1);
            this.list.remove(list.size() - 1);
            this.length--;
            heapifyDown(0);
        }
}

class Main {
    public static void main(String[] args) {
        MinHeap heap = new MinHeap();
        
        heap.insert(5);
        heap.insert(20);
        heap.insert(40);
        heap.insert(10);
        heap.insert(1);
        heap.insert(0);

        heap.removeNode();
        heap.removeNode();
        heap.removeNode();
        
        heap.printHeap();
    }
}

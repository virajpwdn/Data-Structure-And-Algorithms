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

class Main {
    public static void main(String[] args) {
        MinHeap heap = new MinHeap();
        
        heap.insert(5);
        heap.insert(20);
        heap.insert(40);
        heap.insert(10);
        heap.insert(1);
        heap.insert(0);
        
        heap.printHeap();
    }
}

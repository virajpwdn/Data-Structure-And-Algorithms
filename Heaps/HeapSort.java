import java.util.ArrayList;
import java.util.*;

class Heap {
    ArrayList<Integer> list;
    public Heap(){
        this.list = new ArrayList<>();
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
    
    public void maxHeap() {
        for(int i=(list.size() / 2) -1; i >= 0; i--) {
            buildMaxHeap(i);
        }
    }
    
    public void swap(int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
    
    public void print() {
        System.out.println(list);
    }
    
    public void insert(int val) {
        list.add(val);
    }
    
    public void buildMaxHeap(int i) {
            int big = i;
            int leftIdx = getLeftIdx(i);
            int rightIdx = getRightIdx(i);
            int n = list.size();
            
            if(leftIdx < n && list.get(big) < list.get(leftIdx)) big = leftIdx;
            if(rightIdx < n && list.get(big) < list.get(rightIdx)) big = rightIdx;
            
            if(i != big) {
                swap(i, big);
                buildMaxHeap(big);
            }
            // i = big;
    }
    
    
    
    // Not Heapify Down - Bottom To Top
    // public void heapifyDown(int i) {
    //     while(i < list.size()) {
    //         int big = i;
    //         int leftNode = getLeftIdx(i);
    //         int rightNode = getRightIdx(i);
            
    //         if(leftNode < list.size() && list.get(leftNode) > list.get(big)) {
    //             big = leftNode;
    //         }
    //         if(rightNode < list.size()  && list.get(rightNode) > list.get(big)) {
    //             big = rightNode;
    //         }
            
    //         if(i != big) {
    //             swap(i, big);
    //         }else break;
            
    //         i = big;
    //     }
    // }
    
    public void heapSort() {
        maxHeap();
    }
    
}

class Main {
    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.insert(1);
        heap.insert(10);
        heap.insert(5);
        heap.insert(3);
        heap.insert(2);
        heap.insert(4);
        heap.insert(6);
        heap.insert(1);
        heap.insert(0);
        heap.insert(12);
        heap.insert(7);
        heap.maxHeap();
        heap.print();
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class Heap {
    
    ArrayList<Integer> list;
    public Heap() {
        this.list = new ArrayList<>();
    }
    
    public void insert(int val) {
        list.add(val);
    }
    
    public void heapSort() { //0(n) by looking it looks TC is 0(log n) but its not
        int n = list.size();
        for(int i=(n/2)-1; i>=0; i--) {
            buildMaxHeap(i, n);
        }
        
        
        for(int i=n-1; i>0; i--) { //0(n)
            swap(0, i);
            buildMaxHeap(0,i);  //0(logn)
        } 
        
        //TC: 0(n) + 0(n logn) = 0(n logn)
        
        System.out.println(list);
    }
    
    public void buildMaxHeap(int i, int n) {
        int large = i;
        int left = (2 * i) + 1;
        int right = (2 * i) + 2;
        
        if(left < n && list.get(left) > list.get(large)) {
            large = left;
        }
        
        if(right < n && list.get(right) > list.get(large)) {
            large = right;
        }
        
        if(large != i) {
            swap(i, large);
            buildMaxHeap(large, n);
        }
    }
    
    public void swap(int a, int b) {
        int temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
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
        
        heap.heapSort();
    }
}

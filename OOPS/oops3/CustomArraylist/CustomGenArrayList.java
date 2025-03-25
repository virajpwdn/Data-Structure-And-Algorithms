package CustomArraylist;

public class CustomGenArrayList<T> implements Comparable<CustomGenArrayList<T>>{
    private T data[];
    private static final int DEFAULT_SIZE = 10;
    int size = 0;

    @Override
    public int compareTo(CustomGenArrayList<T> o){
        int diff = this.size - o.size;
        return diff;
    }

    public CustomGenArrayList() {
        this.data = (T[]) new Object[DEFAULT_SIZE];
    }

    public int size() {
        return size;
    }

    public void add(T val) {
        if (isFull()) {
            T temp[] = (T[]) new Object[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        data[size++] = val;
    }

    public boolean isFull() {
        return data.length == size;
    }

    public T get(int idx) {
        return data[idx];
    }

    public T remove() {
        T remove = data[size-1];
        size--;
        data[size] = null;
        return remove;
    }

    public T remove(int idx) {
        T toDelete = data[idx];

        for (int i = idx; i < size-1; i++) {
            data[i] = data[i + 1];
        }

        size--;
        data[size] = null;
        return toDelete;
    }

    // This is a generics now we can only add data in our arraylist which has datatype which is in type parameter
    public static void main(String[] args) {
        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        // list.add("HEllo");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "  " );
        }
        System.out.println();
    }
}

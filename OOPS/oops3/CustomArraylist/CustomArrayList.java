package CustomArraylist;

public class CustomArrayList {
    private int data[];
    private static final int DEFAULT_SIZE = 10;
    int size;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public int size() {
        return size;
    }

    public void add(int val) {
        if (isFull()) {
            int temp[] = new int[size * 2];
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

    public int get(int idx) {
        return data[idx];
    }

    public int remove() {
        int remove = data[size-1];
        size--;
        data[size] = 0;
        return remove;
    }

    public int remove(int idx) {
        int toDelete = data[idx];

        for (int i = idx; i < size-1; i++) {
            data[i] = data[i + 1];
        }

        size--;
        data[size] = 0;
        return toDelete;
    }

}

package CustomArraylist;

public class CustomArrayList {
    private int data[];
    private static final int DEFAULT_SIZE = 10;
    int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public int size() {
        return data.length;
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
        int remove = data[size--];
        return remove;
    }

    public int remove(int idx) {
        int toDelete = data[idx];
        int i = idx;
        int j = idx + 1;
        

        while (j < size) {
            data[i++] = data[j++];
        }

        size--;
        data[size] = 0;
        return toDelete;
    }

}

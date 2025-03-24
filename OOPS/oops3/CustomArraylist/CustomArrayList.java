package CustomArraylist;

public class CustomArrayList {
    private static int data[];
    private static int DEFAULT_SIZE = 10;
    static int size = 0;

    CustomArrayList() {
        data = new int[DEFAULT_SIZE];
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

    public boolean isFull(){
        return data.length == size;
    }

    public int get(int idx){
        return data[idx];
    }

    public int remove(){
        int remove = data[size--];
        return remove;
    }

    public int remove(int idx){
        int toDelete = data[idx];
        for (int i = 0; i < idx - 1; i++) {
            
        }

        return toDelete;
    }
}

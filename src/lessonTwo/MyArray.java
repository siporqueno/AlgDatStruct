package lessonTwo;

public class MyArray {
    private int[] arr;
    private int size;

    public MyArray(int size) {
        this.arr = new int[size];
        this.size = 0;
    }

    int get(int index){
        return arr[index];
    }

    void set(int index, int value){
        arr[index]=value;
    }

    void insert(int value) {
        this.arr[size] = value;
        size++;
    }

    void delete(int value) {
        int indexOfValue = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                indexOfValue = i;
                break;
            }
        }
        for (int j = indexOfValue; j < size - 1; j++) {
            arr[j] = arr[j + 1];
        }
        size--;
    }

    public int getSize() {
        return size;
    }

    boolean find(int value) {
        for (int a : arr) {
            if (a == value) return true;
        }
        return false;
    }

    void display() {
        System.out.print("[");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(" " + arr[i] + ",");
        }
        System.out.println(" " + arr[size - 1] + "]");
    }
}

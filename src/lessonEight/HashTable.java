package lessonEight;

public class HashTable {

    private DataItem[] hashArray;
    private int size;
    private DataItem nonItem;

    public HashTable(int size) {
        this.size = size;
        this.hashArray = new DataItem[size];
        this.nonItem = new DataItem(-1);
    }

    public DataItem find(int key) {
        int hashVal = hashFunc(key);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) {
                return hashArray[hashVal];
            }
            ++hashVal;
            hashVal %= size;
//            hashVal = hashVal % size;
        }
        return null;
    }

    public DataItem delete(int key) {
        int hashVal = hashFunc(key);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) {
                DataItem temp = hashArray[hashVal];
                hashArray[hashVal] = nonItem;
                return temp;
            }
            ++hashVal;
            hashVal %= size;
        }
        return null;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            if (hashArray[i] != null) {
                System.out.println(hashArray[i].getKey());
            } else {
                System.out.println("element is null");
            }
        }
    }

    public void insert(DataItem item) {
        int key = item.getKey();
        int hashVal = hashFunc(key);
        if (this.ifFull()) {
            getPrime(size);
        }

        while (hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) {
            ++hashVal;
            hashVal %= size;
        }
        hashArray[hashVal] = item;
    }


    private boolean ifFull() {
        //NO-OP
        return true;
    }


    private int getPrime(int currentHashTableSize) {
        for (int i = currentHashTableSize + 1; true; i++) {
            if (isPrime(i)) {
                return i;
            }
        }
    }

    private boolean isPrime(int i) {
        for (int j = 2; (j * j <= i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }


    private int hashFunc(int key) {
        return key % size;
    }
}

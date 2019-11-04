package lessonEight.chains;

public class HashTableWithChains {

    private LinkedList[] hashArray;
    private int arraySize;
    private Link nonLink;

    public HashTableWithChains(int size) {
        this.arraySize = size;
        this.hashArray = new LinkedList[arraySize];
        this.nonLink=new Link(-1);
        for (int i = 0; i < arraySize; i++) {
            hashArray[i] = new LinkedList();
        }
    }

    private int hashFunc(int key) {
        return key % arraySize;
    }

    public void display() {
        for (int i = 0; i < arraySize; i++) {
            hashArray[i].display();
        }
        System.out.println();
    }

    public void insert(Link link) {
        int key = link.getKey();
        int hashVal = hashFunc(key);
        hashArray[hashVal].insertFirst(link);
    }

    public Link delete(int key) {
        int hashVal = hashFunc(key);
        return hashArray[hashVal].delete(key);
    }

    public Link find(int key) {
        int hashVal = hashFunc(key);
        Link temp;
        for (int i = 0; i < arraySize; i++) if ((temp = hashArray[hashVal].find(key)) != null) return temp;
        return nonLink;
    }

}

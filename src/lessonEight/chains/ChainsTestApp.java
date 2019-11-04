package lessonEight.chains;

public class ChainsTestApp {
    public static void main(String[] args) {
        HashTableWithChains hashTable = new HashTableWithChains(10);
        for (int i = 1; i <= 100; i++) {
            hashTable.insert(new Link(i));
        }
        hashTable.display();
        hashTable.delete(21);
        hashTable.delete(13);
        hashTable.display();
        hashTable.find(13).print();
        System.out.println();
        hashTable.find(50).print();

    }
}

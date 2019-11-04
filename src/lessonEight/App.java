package lessonEight;

public class App {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(20);

        for (int i = 1; i <= 10; i++) {
            hashTable.insert(new DataItem(i));
        }
        hashTable.display();
        hashTable.insert(new DataItem(15));
        hashTable.insert(new DataItem(12));
        hashTable.display();

        hashTable.delete(9);
        hashTable.display();

        System.out.println(hashTable.find(9)==null ? null : hashTable.find(9).getKey());
        System.out.println(hashTable.find(0)==null ? null : hashTable.find(0).getKey());
        System.out.println(hashTable.find(3)==null ? null : hashTable.find(3).getKey());
    }
}

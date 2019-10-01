package lessonTwo;

import java.util.Random;

public class MyArrayApp {
    static long timeOfStart;
    static Random random = new Random();

    public static void main(String[] args) {
        MyArray randomArr = new MyArray(1000);
        for (int i = 0; i < 1000; i++) {
            randomArr.insert(random.nextInt(100));
        }

        System.out.print("Unsorted array: ");
        randomArr.display();
        MyArray temp = randomArr;

        System.out.println("Let's sort by Bubble sorting method");
        timeOfStart = System.nanoTime();
        Sorting.sortBubble(temp);
        System.out.println("Sorting time: " + (System.nanoTime() - timeOfStart)/1000+" microseconds");
        System.out.print("Sorting result: ");
        temp.display();

        System.out.println("Let's sort by Select sorting method");
        temp=randomArr;
        timeOfStart = System.nanoTime();
        Sorting.sortSelect(temp);
        System.out.println("Sorting time: " + (System.nanoTime() - timeOfStart)/1000+" microseconds");
        System.out.print("Sorting result: ");
        temp.display();
    }
}

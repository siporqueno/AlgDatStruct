package lessonTwo;

import java.util.Random;

public class MyArrayApp {
    static long timeOfStart;
    static Random random = new Random();
    static final int SIZE = 10000;

    public static void main(String[] args) {
        MyArray randomArrOne = new MyArray(SIZE);
        MyArray randomArrTwo = new MyArray(SIZE);
        MyArray randomArrThree = new MyArray(SIZE);
        for (int i = 0; i < SIZE; i++) {
            int temp = random.nextInt(100);
            randomArrOne.insert(temp);
            randomArrTwo.insert(temp);
            randomArrThree.insert(temp);
        }

        System.out.println("Let's sort by Bubble sorting method");
        System.out.println("Unsorted array: ");
        randomArrOne.display();
        timeOfStart = System.currentTimeMillis();
        Sorting.sortBubble(randomArrOne);
        System.out.println("Sorting time: " + (System.currentTimeMillis() - timeOfStart) + " milliseconds");
        System.out.print("Sorting result: ");
        randomArrOne.display();

        System.out.println("Let's sort by Select sorting method");
        System.out.println("Unsorted array: ");
        randomArrTwo.display();
        timeOfStart = System.currentTimeMillis();
        Sorting.sortSelect(randomArrTwo);
        System.out.println("Sorting time: " + (System.currentTimeMillis() - timeOfStart) + " milliseconds");
        System.out.print("Sorting result: ");
        randomArrTwo.display();

        System.out.println("Let's sort by Insert sorting method");
        System.out.println("Unsorted array: ");
        randomArrThree.display();
        timeOfStart = System.currentTimeMillis();
        Sorting.sortInsert(randomArrThree);
        System.out.println("Sorting time: " + (System.currentTimeMillis() - timeOfStart) + " milliseconds");
        System.out.print("Sorting result: ");
        randomArrThree.display();
    }
}

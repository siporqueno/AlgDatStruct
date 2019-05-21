package Preparation;

import java.util.Random;

public class TimeMeasurement {

    static Random random = new Random();

    static long measure() {
        long start, finish;
        start = System.nanoTime();
        int[] numbers = new int[10000000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(numbers.length);
        }
        finish = System.nanoTime();
        return finish - start;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println((i +1)+" "+measure()/1000000);
        }
    }
}

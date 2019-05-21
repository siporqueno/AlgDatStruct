package Preparation;

import java.util.Arrays;
import java.util.Random;

public class TimeMeasurement {

    static TimeMeasurement timeMeasurement;
    static int[] testArr = {10, 8, 6, 4, 2};

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

    int[] bubbleSort(int[] inputArr) {
        int temporaryVariable;

        for (int i = inputArr.length - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (inputArr[j - 1] > inputArr[j]) {
                    temporaryVariable = inputArr[j - 1];
                    inputArr[j - 1] = inputArr[j];
                    inputArr[j] = temporaryVariable;
                }
            }
        }

        return inputArr;
    }

    public static void main(String[] args) {
        timeMeasurement = new TimeMeasurement();
        System.out.println(Arrays.toString(testArr));
        System.out.println(Arrays.toString(timeMeasurement.bubbleSort(testArr)));
        for (int i = 0; i < 100; i++) {
            System.out.println((i + 1) + " " + measure() / 1000000);
        }
    }
}

package lessonTwo;

public class Sorting {

    private Sorting() {
    }

    public static void sortBubble(MyArray myArray) {
        int in, out;
        for (out = myArray.getSize(); out >= 0; out--) {
            for (in = 1; in < out; in++) {
                if (myArray.get(in - 1) > myArray.get(in)) interchange(myArray, in - 1, in);
            }
        }
    }

    public static void sortSelect(MyArray myArray) {
        int in, out, mark;
        int size = myArray.getSize();
        for (out = 0; out < size; out++) {
            mark = out;
            for (in = out + 1; in < size; in++) {
                if (myArray.get(in) < myArray.get(mark)) mark = in;
            }
            interchange(myArray, out, mark);
        }
    }

    public static void sortInsert(MyArray myArray) {
        int in, out;
        int size = myArray.getSize();
        for (out = 1; out < size; out++) {
            in = out - 1;
            int outElement = myArray.get(out);
            while (0 <= in && outElement < myArray.get(in)) {
                myArray.set(in + 1, myArray.get(in));
                --in;
            }
            myArray.set(in + 1, outElement);
        }
    }

    private static void interchange(MyArray myArray, int indexOne, int indexTwo) {
        int temp = myArray.get(indexOne);
        myArray.set(indexOne, myArray.get(indexTwo));
        myArray.set(indexTwo, temp);
    }
}

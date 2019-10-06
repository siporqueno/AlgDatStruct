package lessonThree.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Home work of Lesson 3, point 2.
public class AppToReverseSentences {
    public static void main(String[] args) {
        String input;
        while (true) {
            try {
                input = getString();
                if (input.equals("") || input.equals("Basta!")) break;
                // Let's create an object to represent sentence to be reversed
                SentenceToReverse sentence = new SentenceToReverse(input);
                System.out.println(sentence.reverse());
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    private static String getString() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        return reader.readLine();
    }
}

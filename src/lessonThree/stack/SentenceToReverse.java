package lessonThree.stack;

public class SentenceToReverse {
    private String input;

    public SentenceToReverse(String input) {
        this.input = input;
    }

    public String reverse() {
        int size = input.length();
        StringBuilder sb = new StringBuilder(size);
        StackOfChars stack = new StackOfCharsImpl(size);
        for (int i = 0; i < size; i++) {
            char ch = input.charAt(i);
            stack.push(ch);
        }
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}

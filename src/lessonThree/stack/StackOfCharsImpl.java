package lessonThree.stack;

// Home work of Lesson 3, point 1.
public class StackOfCharsImpl implements StackOfChars {
    private int maxSize;
    private char[] stack;
    private int top;

    public StackOfCharsImpl(int size) {
        this.maxSize = size;
        this.stack = new char[this.maxSize];
        this.top = -1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == maxSize - 1;
    }

    @Override
    public void push(char element) {
        stack[++top]=element;
    }

    @Override
    public char pop() {
        return stack[top--];
    }

    @Override
    public char peek() {
        return stack[top];
    }
}

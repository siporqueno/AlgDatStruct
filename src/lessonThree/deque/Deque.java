package lessonThree.deque;

// Home work of Lesson 3, point 3.
public interface Deque {

    public boolean isEmpty();

    public boolean isFull();

    public int size();

    public void insertLeft(int element);

    public void insertRight(int element);

    public int removeLeft();

    public int removeRight();

    public int peekLeft();

    public int peekRight();


}

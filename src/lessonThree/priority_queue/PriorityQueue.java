package lessonThree.priority_queue;

// Home work of Lesson 3, point 1.
public interface PriorityQueue {

    public boolean isEmpty();

    public boolean isFull();

    public int size();

    public void insert(int element);

    public int remove();

    public int peek();
}

package lessonThree.deque;

// Home work of Lesson 3, point 3.
public class DequeImpl implements Deque {
    private int[] queue;
    private int front, rear, items, maxSize;

    public DequeImpl(int s) {
        this.maxSize = s;
        this.queue = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.items = 0;
    }

    @Override
    public boolean isEmpty() {
        return items == 0;
    }

    @Override
    public boolean isFull() {
        return items == maxSize;
    }

    @Override
    public int size() {
        return items;
    }

    // The same as insert(int element) from QueueImpl
    @Override
    public void insertLeft(int element) {
        if (rear == maxSize - 1) rear = -1;
        queue[++rear] = element;
        items++;
    }

    @Override
    public void insertRight(int element) {
        if (front == 0) front = maxSize;
        queue[--front] = element;
        items++;
    }

    @Override
    public int removeLeft() {
        int temp = queue[rear--];
        if (rear == -1) rear = maxSize - 1;
        items--;
        return temp;
    }

    // The same as remove() from QueueImpl
    @Override
    public int removeRight() {
        int temp = queue[front++];
        if (front == maxSize) front = 0;
        items--;
        return temp;
    }

    // The same as peek() from QueueImpl
    @Override
    public int peekRight() {
        return queue[front];
    }

    @Override
    public int peekLeft() {
        return queue[rear];
    }
}

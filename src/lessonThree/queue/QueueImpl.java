package lessonThree.queue;

// Home work of Lesson 3, point 1.
public class QueueImpl implements Queue {
    private int[] queue;
    private int front, rear, items, maxSize;

    public QueueImpl(int s) {
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

    @Override
    public void insert(int element) {
        if (rear == maxSize - 1) rear = -1;
        queue[++rear] = element;
        items++;
    }

    @Override
    public int remove() {
        int temp = queue[front++];
        if (front == maxSize) front = 0;
        items--;
        return temp;
    }

    @Override
    public int peek() {
        return queue[front];
    }
}

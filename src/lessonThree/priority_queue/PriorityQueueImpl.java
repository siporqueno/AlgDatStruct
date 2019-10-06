package lessonThree.priority_queue;

// Home work of Lesson 3, point 1.
public class PriorityQueueImpl implements PriorityQueue {
    private int[] queue;
    private int items, maxSize;

    public PriorityQueueImpl(int s) {
        this.maxSize = s;
        this.queue = new int[maxSize];
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
        int i;
        if (items == 0) {
            queue[items++] = element;
        } else {
            for (i = items - 1; i >= 0; i--) {
                if (element > queue[i]) {
                    queue[i + 1] = queue[i];
                } else break;
            }
            queue[i + 1] = element;
            items++;
        }
    }

    @Override
    public int remove() {
        return queue[--items];
    }

    @Override
    public int peek() {
        return queue[items - 1];
    }
}

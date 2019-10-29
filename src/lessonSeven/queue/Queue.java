package lessonSeven.queue;

public interface Queue {

    public boolean isEmpty();

    public boolean isFull();

    public int size();

    public void insert(int i);

    public int remove();

    public int peek();

}

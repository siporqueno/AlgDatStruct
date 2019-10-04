package lessonThree.queue;

// Home work of Lesson 3, point 1.
public class AppTestQueue {
    public static void main(String[] args) {
        Queue queue = new QueueImpl(5);
        queue.insert(111);
        queue.insert(222);
        queue.insert(333);
        queue.insert(444);
        queue.insert(555);
        queue.remove();
        queue.remove();
        queue.remove();
        queue.insert(12);
        queue.insert(23);
        while (!queue.isEmpty()) System.out.println(queue.remove());
    }
}

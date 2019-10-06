package lessonThree.priority_queue;

public class AppTestPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueueImpl(5);
        priorityQueue.insert(66);
        priorityQueue.insert(33);
        priorityQueue.insert(11);
        priorityQueue.insert(-55);
        priorityQueue.insert(22);
        while (!priorityQueue.isEmpty()) System.out.println(priorityQueue.remove());
    }
}

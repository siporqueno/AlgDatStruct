package lessonFour.queue_from_double_list;

public class QueueApp {
    public static void main(String[] args) {
        Queue queue = new QueueImpl();
        queue.insert("Artem", 23);
        queue.insert("Yaroslav", 25);
        queue.insert("Inga", 28);
        queue.display();
        System.out.println();
        queue.remove();
        queue.display();
    }
}

package lessonFour.queue_from_double_list;

import lessonFour.double_link_list.DoubleLinkedList;

public class QueueImpl implements Queue {
    private DoubleLinkedList list;

    public QueueImpl() {
        this.list = new DoubleLinkedList();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void insert(String name, int age) {
        list.insertLast(name, age);
    }

    @Override
    public String remove() {
        return list.delete().name;
    }

    @Override
    public String peek() {
        return list.getFirst().name;
    }

    @Override
    public void display() {
        list.display();
    }
}

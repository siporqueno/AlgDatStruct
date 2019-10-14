package lessonFour.stack_from_list;

import lessonFour.list.SingleLinkedList;

public class StackImpl implements Stack {
    private SingleLinkedList list;

    public StackImpl() {
        this.list = new SingleLinkedList();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void display() {
        list.display();
    }

    @Override
    public void push(String name, int age) {
        list.insertFirst(name, age);
    }

    @Override
    public String pop() {
        return list.delete().name;
    }

    @Override
    public String peek() {
        return list.getFirst().name;
    }
}

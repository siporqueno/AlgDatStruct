package lessonFour.iterator;

import lessonFour.list.Link;
import lessonFour.list.SingleLinkedList;

public class ListIterator {

    private Link current;
    private Link prev;
    private SingleLinkedList list;

    public ListIterator(SingleLinkedList list) {
        this.list = list;
        reset();
    }

    private void reset() {
        current = list.getFirst();
        prev = null;
    }

    public void nextLink() {
        prev = current;
        current = current.next;
    }

    public boolean atEnd() {
        return (current.next == null);
    }

    public Link getCurrent() {
        return current;
    }

    public void insertAfter(String name, int age) {
        Link link = new Link(name, age);
        if (list.isEmpty()) {
            list.setFirst(link);
            current = link;
        } else {
            link.next = current.next;
            current.next = link;
            nextLink();
        }
    }

    public void insertBefore(String name, int age) {
        Link link = new Link(name, age);
        if (prev == null) {
            link.next = list.getFirst();
            list.setFirst(link);
            reset();
        } else {
            link.next = prev.next;
            prev.next = current = link;
        }
    }

    /**
     * NOOP
     */
    // Home work of Lesson 4
    public String deleteCurrent() {
        String name = current.name;
        if (prev == null) {
            list.setFirst(current.next);
            reset();
        } else {
            prev.next = current.next;
            if (atEnd()) {
                reset();
            } else {
                current = current.next;
            }
        }
        return name;
    }
}

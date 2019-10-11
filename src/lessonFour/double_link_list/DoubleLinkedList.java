package lessonFour.double_link_list;

import lessonFour.list.Link;
import lessonFour.list.LinkedList;

public class DoubleLinkedList extends LinkedList {
    private Link last;

    public DoubleLinkedList() {
        this.setFirst(null);
        this.last = last;
    }

    public Link getLast() {
        return last;
    }

    public void setLast(Link last) {
        this.last = last;
    }

    @Override
    public void insertFirst(String name, int age) {
        Link newLink = new Link(name, age);
        if (this.isEmpty()) {
            last = newLink;
        }
        newLink.next = this.getFirst();
        this.setFirst(newLink);
    }

    public void insertLast(String name, int age) {
        Link newLink = new Link(name, age);
        if (this.isEmpty()) {
            this.setFirst(newLink);
        } else {
            last.next = newLink;
        }
        last = newLink;
    }

    @Override
    public Link delete() {
        Link temp = this.getFirst();
        if (this.getFirst().next == null) {
            last = null;
        }
        this.setFirst(this.getFirst().next);
        return temp;
    }
}

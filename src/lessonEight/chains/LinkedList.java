package lessonEight.chains;

public class LinkedList {
    private Link first;
    private Link nonLink = new Link(-1);

    public LinkedList() {
        this.first = nonLink;
    }

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }

    public void insertFirst(int data) {
        Link newLink = new Link(data);
        newLink.next = first;
        first = newLink;
    }

    public void insertFirst(Link link) {
        Link newLink = link;
        newLink.next = first;
        first = newLink;
    }

    public Link delete() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public Link delete(int data) {
        Link current = first;
        Link prev = first;
        while (current.data != data) {
            if (current.data == -1) {
                return null;
            } else {
                prev = current;
                current = current.next;
            }
        }
        if (current == first)
            first = first.next;
        else
            prev.next = current.next;
        return current;
//        A -> B -> C

//        A - prev
//        B - current
//        C - current.next
    }

    public Link find(int data) {
        Link current = first;
        while (current.data != data) {
            if (current.data == -1) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public boolean isFound(int data) {
        boolean result = false;
        Link current = first;
        while (current.data != -1) {
            if (current.data == data) {
                result = true;
                break;
            } else if (current.next != nonLink) {
                current = current.next;
            } else {
                break;
            }
        }
        return result;
    }

    public boolean isEmpty() {
        return (first.data == -1);
    }

    public void display() {
        Link current = first;
//        while (current != null) {
        while (current.data != -1) {
            current.print();
            current = current.next;
        }
        System.out.println();
    }
}

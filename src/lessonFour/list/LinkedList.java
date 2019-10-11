package lessonFour.list;

public abstract class LinkedList {
    private Link first;

    public Link getFirst() {
        return first;
    }
    public void setFirst(Link first) {
        this.first = first;
    }

    public void insertFirst(String name, int age) {
        Link newLink = new Link(name, age);
        newLink.next = first;
        first = newLink;
    }

    public Link delete() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public Link delete(String name) {
        Link current = first;
        Link prev = first;
        while (current.name != name) {
            if (current.name == null) {
                return null;
            } else {
                prev = current;
                current = current.next;
            }
        }
        if(current == first)
            first = first.next;
        else
            prev.next = current.next;
        return current;
//        A -> B -> C

//        A - prev
//        B - current
//        C - current.next
    }

    public Link find(String name) {
        Link current = first;
        while (current.name != name) {
            if (current.name == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public boolean isFound(String name) {
        boolean result = false;
        Link current = first;
        while (current.name != null) {
            if (current.name == name) {
                result = true;
                break;
            } else if (current.next != null) {
                current = current.next;
            } else {
                break;
            }
        }
        return result;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void display() {
        Link current = first;
        while (current != null) {
            current.print();
            current = current.next;
        }
    }
}

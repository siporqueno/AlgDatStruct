package lessonThree.deque;

// Home work of Lesson 3, point 3.
public class AppTestDeque {
    public static void main(String[] args) {
        Deque deque = new DequeImpl(10);
        deque.insertLeft(11);
        deque.insertLeft(33);
        deque.insertLeft(25);
        deque.insertLeft(5);
        deque.removeRight();
        deque.insertRight(777);
        deque.insertLeft(333);
        deque.insertRight(1111);
        deque.insertLeft(45);
        deque.removeLeft();
        deque.removeLeft();
        deque.removeLeft();
        while (!deque.isEmpty()) System.out.println(deque.removeRight());
        deque.insertLeft(11);
        deque.insertLeft(22);
        deque.insertLeft(33);
        deque.insertLeft(44);
        deque.insertLeft(55);
        while (!deque.isEmpty()) System.out.println(deque.removeLeft());
    }
}

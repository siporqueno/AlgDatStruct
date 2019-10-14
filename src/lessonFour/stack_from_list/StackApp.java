package lessonFour.stack_from_list;

public class StackApp {
    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
        stack.push("Artem", 23);
        stack.push("Yaroslav", 25);
        stack.push("Inga", 28);
        stack.display();
        stack.pop();
        stack.display();
    }
}

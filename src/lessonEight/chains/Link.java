package lessonEight.chains;

public class Link {

    /*public String name;
    public int age;
    public Link next;

    public Link(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println(String.format("name %s age %d", name, age));
    }*/

    public int data;
    public Link next;

    public Link(int data) {
        this.data = data;
    }

    public int getKey() {
        return data;
    }

    public void print() {
        System.out.printf(data + " ");
    }
}

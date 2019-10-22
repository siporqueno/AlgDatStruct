package lessonSix;

public interface Tree {

    Node find(int id);

    void insert (int id);

    Node min();

    Node max();

    boolean delete(int key);

}

package lessonSeven;

public class SearchPathApp {
    private static Graph graph = new Graph();

    public static void main(String[] args) {
        // Setting 10 vertexes
        for (int i = 'A'; i <= 'J'; i++) graph.addVertex((char) i);

        // Setting edges
        // label:index A:0 B:1 C:2 D:3 E:4 F:5 G:6 H:7 I:8 J:9
        graph.addEdge(0, 1); // A-B
        graph.addEdge(0, 2); // A-C
        graph.addEdge(0, 3); // A-D
        graph.addEdge(1, 2); // B-C
        graph.addEdge(2, 3); // C-D
        graph.addEdge(1, 4); // B-E
        graph.addEdge(2, 5); // C-F
        graph.addEdge(3, 6); // D-G
        graph.addEdge(4, 7); // E-H
        graph.addEdge(5, 8); // F-I
        graph.addEdge(6, 9); // G-J
        graph.addEdge(8, 7); // I-H
        graph.addEdge(9, 7); // J-H

    }
}

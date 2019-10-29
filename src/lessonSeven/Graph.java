package lessonSeven;

import lessonSeven.queue.Queue;
import lessonSeven.queue.QueueImpl;
import lessonSeven.stack.Stack;
import lessonSeven.stack.StackImpl;

public class Graph {

    private final int VERTS = 10;
    private Vertex[] vertexList;
    private int[][] matrix;
    private int size;
    // Home work of Lesson 7, array of indexes of vertexes called "parents". Parent is a vertex, which is an argument of method getUnvisitedVertex for
    // vertex returned by this method (provided that it does not return -1)
    // in the expression y = getUnvisitedVertex(x), x - index (in the array vertexList) of parent for the vertex with index y. y is a child.
    private int[] parent;

    Stack stack;
    Queue queue;

    public Graph() {
        stack = new StackImpl(VERTS);
        queue = new QueueImpl(VERTS);

        vertexList = new Vertex[VERTS];
        matrix = new int[VERTS][VERTS];
        size = 0;

        // Home work of Lesson 7
        parent = new int[VERTS];
    }

    public void addVertex(char label) {
        vertexList[size++] = new Vertex(label);
    }

    public void addEdge(int start, int end) {
        matrix[start][end] = 1;
        matrix[end][start] = 1;
    }

    public void display(int vertex) {
        System.out.println(vertexList[vertex].label);
    }

    public void displayInLine(int vertex) {
        System.out.print(vertexList[vertex].label + " ");
    }

    private int getUnvisitVertex(int ver) {
        for (int i = 0; i < size; i++) {
            if (matrix[ver][i] == 1 && !vertexList[i].wasVisited) {
                return i;
            }
        }
        return -1;
    }

    //depth-first search
    public void dfs() {
        vertexList[0].wasVisited = true;
        display(0);
        stack.push(0);
        while (!stack.isEmpty()) {
            int v = getUnvisitVertex(stack.peek());
            if (v == -1) {
                stack.pop();
            } else {
                vertexList[v].wasVisited = true;
                display(v);
                stack.push(v);
            }
        }
        for (int i = 0; i < size; i++) {
            vertexList[i].wasVisited = false;
        }
    }

    //breadth-first search
    public void bfs() {
        vertexList[0].wasVisited = true;
        display(0);
        queue.insert(0);
        int w;
        while (!queue.isEmpty()) {
            int v = queue.remove();
            while ((w = getUnvisitVertex(v)) != -1) {
                vertexList[w].wasVisited = true;
                display(w);
                queue.insert(w);
                // parent[w]=v;
            }
        }
        for (int i = 0; i < size; i++) {
            vertexList[i].wasVisited = false;
        }
    }

    //Home work of Lesson 7, breadth-first search from vertex with index indexOfStartVertex
    public int[] bfs(int indexOfStartVertex) {

        // Initialization of parent array
        for (int a : parent) a = -1;

        vertexList[indexOfStartVertex].wasVisited = true;
//        display(indexOfStartVertex);
        queue.insert(indexOfStartVertex);
        // Start vertex does not have any parent (because it is start vertex) so its parent index in parent array will remain -1
        int w;
        while (!queue.isEmpty()) {
            int v = queue.remove();
            while ((w = getUnvisitVertex(v)) != -1) {
                vertexList[w].wasVisited = true;
//                display(w);
                queue.insert(w);
                // Filling-in of parent array
                parent[w] = v;
            }
        }
        for (int i = 0; i < size; i++) {
            vertexList[i].wasVisited = false;
        }
        return parent;
    }

    // Method to get index of vertex by its label in vertexList
    int getIndexOfVertexByItsLabel(char vertexLabel) {
        for (int i = 0; i < size; i++) if (vertexList[i].label == vertexLabel) return i;
        return -1;
    }

}

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

    Stack stack;
    Queue queue;

    public Graph() {
        stack = new StackImpl(VERTS);
        queue = new QueueImpl(VERTS);

        vertexList = new Vertex[VERTS];
        matrix = new int[VERTS][VERTS];
        size = 0;
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
        while(!queue.isEmpty()){
            int v = queue.remove();
            while((w = getUnvisitVertex(v)) != -1){
                vertexList[w].wasVisited = true;
                display(w);
                queue.insert(w);
            }
        }
        for (int i = 0; i < size; i++) {
            vertexList[i].wasVisited = false;
        }
    }
}

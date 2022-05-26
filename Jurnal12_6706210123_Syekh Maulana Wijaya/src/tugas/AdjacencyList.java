package tugas;

import java.util.LinkedList;

public class AdjacencyList {
    int V;
    LinkedList<Character> adjListArray[];

    // constructor
    AdjacencyList(int V) {
        this.V = V;

        // define the size of array as
        // number of vertices
        adjListArray = new LinkedList[V];

        // Create a new list for each vertex
        // such that adjacent nodes can be stored
        for(int i = 0; i < V; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }

    // Adds an edge to a directed graph
    public void addEdge(char src, char dest) {
        // Add an edge from src to dest
        int intsrc = (int)src - 65;
        adjListArray[intsrc].add(dest);
    }

    // A utility function to print the adjacency list
    // representation of graph
    public void printGraph() {
        for(int i = 0; i < V; i++) {
            if(adjListArray[i].size() > 0) {
                char vertex = (char)(i + 65);
                System.out.print("Vertex " + vertex + " is connected to: ");
                for(int j = 0; j < adjListArray[i].size(); j++) {
                    System.out.print(adjListArray[i].get(j) + " ");
                }
                System.out.println();
            }
        }
    }
}

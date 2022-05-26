package modul.ar;

public class Main {
    public static void main(String[] args) {
        AdjacencyMatrix myMatrix = new AdjacencyMatrix(4);

        myMatrix.addEdge(0, 1);
        myMatrix.addEdge(1, 0);
        myMatrix.addEdge(1, 2);
        myMatrix.addEdge(1, 3);
        myMatrix.addEdge(2, 3);

        myMatrix.printMatrix();
        System.out.println(myMatrix.inEdges(3));
        System.out.println(myMatrix.outEdges(3));
    }
}

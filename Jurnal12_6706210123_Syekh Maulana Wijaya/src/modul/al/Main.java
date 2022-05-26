package modul.al;

public class Main {
    public static void main(String[] args) {
        AdjacencyList myList = new AdjacencyList(4);
        myList.addEdge(0, 1);
        myList.addEdge(0, 3);
        myList.addEdge(1, 2);
        myList.addEdge(1, 3);

        myList.printGraph();
    }
}

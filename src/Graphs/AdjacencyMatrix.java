import java.util.ArrayList;

/**
 * AdjacencyMatrix
 */
public class AdjacencyMatrix {

  public static void main(String[] args) {
    AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(5);
    graph.addNode(new Node("A"));
    graph.addNode(new Node("B"));
    graph.addNode(new Node("C"));
    graph.addNode(new Node("D"));
    graph.addNode(new Node("E"));

    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(1, 3);
    graph.addEdge(2, 3);
    graph.addEdge(3, 4);
    graph.addEdge(4, 4);
    graph.addEdge(4, 0);

    graph.print();
    System.out.println(graph.checkEdge(0, 0));
  }
}

class AdjacencyMatrixGraph extends Graph {

  ArrayList<Node> nodes;
  int[][] matrix;

  AdjacencyMatrixGraph(int size) {
    nodes = new ArrayList<>();
    matrix = new int[size][size];
  }

  public void addNode(Node node) {
    nodes.add(node);
  }

  public void addEdge(int src, int dst) {
    matrix[src][dst] = 1;
  }

  public boolean checkEdge(int src, int dst) {
    if (matrix[src][dst] == 1) {
      return true;
    } else {
      return false;
    }
  }

  public void print() {
    System.out.print("  ");
    for (Node node : nodes) {
      System.out.print(node.data + " ");
    }
    System.out.println();
    for (int i = 0; i < matrix.length; i++) {
      System.out.print(nodes.get(i).data + " ");
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}

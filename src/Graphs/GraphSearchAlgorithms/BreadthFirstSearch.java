import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * BreadthFirstSearch
 */
public class BreadthFirstSearch {
  public static void main(String[] args) {
    BreadthFirstSearchGraph graph = new BreadthFirstSearchGraph(5);
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
    graph.breadthFirstSearch(1);
  }
}

class BreadthFirstSearchGraph extends Graph {

  ArrayList<Node> nodes;
  int[][] matrix;

  BreadthFirstSearchGraph(int size) {
    super();
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
      System.out.print(node.intData + " ");
    }
    System.out.println();
    for (int i = 0; i < matrix.length; i++) {
      System.out.print(nodes.get(i).intData + " ");
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }

  public void breadthFirstSearch(int src) {
    Queue<Integer> queue = new LinkedList<>();
    boolean[] visited = new boolean[matrix.length];

    queue.offer(src);
    visited[src] = true;

    while (queue.size() != 0) {
      src = queue.poll();
      System.out.println(nodes.get(src).intData + " = visited");

      for (int i = 0; i < matrix[src].length; i++) {
        if (matrix[src][i] == 1 && !visited[i]) {
          queue.offer(i);
          visited[i] = true;
        }
      }
    }
  }

}

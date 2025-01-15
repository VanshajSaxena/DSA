import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstrasAlgorithm {
  public int[] dijkstrasAlgorithm(int[][] graph) {
    int n = graph.length;

    // Initialize adjacency list to store graph representation
    List<List<int[]>> adj = new ArrayList<>();

    // Create an empty list for each node
    for (int i = 0; i < n; i++) {
      adj.add(new ArrayList<>());
    }

    // Populate adjacency list with edges from the input graph
    for (int[] edge : graph) {
      adj.get(edge[0]).add(new int[] { edge[1], edge[2] });
    }

    // Initialize distance array with maximum values
    int[] distance = new int[n];
    Arrays.fill(distance, Integer.MAX_VALUE);

    // Distance to the source node is zero
    distance[0] = 0;
    PriorityQueue<int[]> queue = new PriorityQueue<>();

    // Add the source node to the priority queue
    queue.offer(new int[] { 0, 0 });

    // Process nodes in the priority queue
    while (!queue.isEmpty()) {
      int[] curr = queue.poll();
      int currNode = curr[0];
      int currDist = curr[1];

      // Skip processing if a shorter path to the current node has been found
      if (currDist > distance[currNode]) {
        continue;
      }

      // Explore neighbors of the current node
      for (int[] neighbor : adj.get(currNode)) {

        // Update distance if a shorter path to the neighbor is found
        if (distance[neighbor[0]] > currDist + neighbor[1]) {
          distance[neighbor[0]] = currDist + neighbor[1];
          queue.offer(new int[] { neighbor[0], currDist + neighbor[1] });
        }
      }
    }

    // Return the computed shortest distances from the source node
    return distance;
  }
}

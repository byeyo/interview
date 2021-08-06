package problem1;

import java.util.*;

public class Graph {

    private PriorityQueue<Node> queue = new PriorityQueue<>(new Comparator<Node>() {
        @Override
        public int compare(Node o1, Node o2) {
            if (o1.value < o2.value) {
                return 1;
            }
            if (o1.value == o2.value) {
                return 0;
            }
            return -1;
        }
    });
    public Map<Node, List<Node>> graph = new HashMap<>();
    public void addEdge(Edge edge) {
        Node from = edge.from;
        Node to = edge.to;
        if (!graph.containsKey(from)) {
            List<Node> nextNodeList = new LinkedList<>();
            graph.put(from, nextNodeList);
        }
        graph.get(from).add(to);
        queue.add(from);
        to.value++;
    }
    public Node getNextTask() {
        Node node = this.queue.poll();
      List<Node> nodeList = graph.get(node);
      Node result = node;
      graph.remove(node);
      if (nodeList == null) {
          return result;
      }
      nodeList.forEach(item -> {
          item.value --;
          graph.put(item, graph.get(item));
      });
      return result;
    }
}

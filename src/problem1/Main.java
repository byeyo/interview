package problem1;

public class Main {
    /**
     * 拓扑排序，优先队列
     * @param args
     */
    public static void main(String[] args) {
        Graph g = new Graph();
        System.out.print("Test input:");
        Edge e = new Edge(new Node("H"), new Node("C"));
        g.addEdge(e);
        g.addEdge(new Edge(new Node("B"), new Node("G")));
        g.addEdge(new Edge(new Node("C"), new Node("A")));
        g.addEdge(new Edge(new Node("G"), new Node("A")));
        System.out.print("Test output:");
        while(!g.graph.isEmpty()) {
            System.out.print(g.getNextTask().name() +" ");
        }

    }
}

package problem1;

public class Node {
    public String name;
    public int value = 0;


    public Node(String name) {
        this.name = name;
    }
    public String name() {
        return this.name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        return name.equals(node.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

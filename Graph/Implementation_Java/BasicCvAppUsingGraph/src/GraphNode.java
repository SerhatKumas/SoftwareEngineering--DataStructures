import java.util.LinkedList;
import java.util.List;

public class GraphNode {
    String value;
    List<GraphNode> adjacencyList;

    public GraphNode(String value, LinkedList<GraphNode> adjacencyList) {
        this.value = value;
        this.adjacencyList = adjacencyList;
    }
}

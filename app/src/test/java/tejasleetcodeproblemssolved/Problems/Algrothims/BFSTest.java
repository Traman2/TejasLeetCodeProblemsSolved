package tejasleetcodeproblemssolved.Problems.Algrothims;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import tejasleetcodeproblemssolved.Problems.Structures.Graph;
import tejasleetcodeproblemssolved.Problems.Structures.Graph.Node;

class BFSTest {

    // Check normal case: target reachable via the shortest path, visiting nodes level by level
    @Test void bfsVisitsNodesInLevelOrderUntilTargetFound() {
        BFS.testGraph = new Graph();
        BFS.testGraph.addNode('a');
        BFS.testGraph.addNode('b');
        BFS.testGraph.addNode('c');
        BFS.testGraph.addNode('d');
        BFS.testGraph.addNode('e');
        BFS.testGraph.addNode('f');

        BFS.testGraph.addEdge('a', 'b');
        BFS.testGraph.addEdge('a', 'c');
        BFS.testGraph.addEdge('a', 'd');
        BFS.testGraph.addEdge('b', 'e');
        BFS.testGraph.addEdge('c', 'd');
        BFS.testGraph.addEdge('d', 'e');
        BFS.testGraph.addEdge('d', 'f');
        BFS.testGraph.addEdge('e', 'f');

        List<Node> order = BFS.BFSAlgrothim('a', 'd');
        StringBuilder visited = new StringBuilder();
        for(Node n : order) visited.append(n.value);

        assertEquals("abcd", visited.toString());
    }

    // Check case where start node equals target node
    @Test void bfsReturnsSingleNodeWhenStartEqualsTarget() {
        BFS.testGraph = new Graph();
        BFS.testGraph.addNode('a');
        BFS.testGraph.addNode('b');
        BFS.testGraph.addEdge('a', 'b');

        List<Node> order = BFS.BFSAlgrothim('a', 'a');

        assertEquals(1, order.size());
        assertEquals('a', order.get(0).value);
    }

    // Check case where target is unreachable, traversal visits entire connected component
    @Test void bfsVisitsAllReachableNodesWhenTargetUnreachable() {
        BFS.testGraph = new Graph();
        BFS.testGraph.addNode('a');
        BFS.testGraph.addNode('b');
        BFS.testGraph.addNode('c');
        BFS.testGraph.addEdge('a', 'b');

        List<Node> order = BFS.BFSAlgrothim('a', 'z');

        assertEquals(2, order.size());
        assertEquals('a', order.get(0).value);
        assertEquals('b', order.get(1).value);
    }

    // Check single node graph with no edges
    @Test void bfsHandlesSingleNodeGraph() {
        BFS.testGraph = new Graph();
        BFS.testGraph.addNode('a');

        List<Node> order = BFS.BFSAlgrothim('a', 'a');

        assertEquals(1, order.size());
        assertEquals('a', order.get(0).value);
    }

    // Check a simple linear chain graph
    @Test void bfsTraversesLinearChain() {
        BFS.testGraph = new Graph();
        BFS.testGraph.addNode('a');
        BFS.testGraph.addNode('b');
        BFS.testGraph.addNode('c');
        BFS.testGraph.addEdge('a', 'b');
        BFS.testGraph.addEdge('b', 'c');

        List<Node> order = BFS.BFSAlgrothim('a', 'c');
        StringBuilder visited = new StringBuilder();
        for(Node n : order) visited.append(n.value);

        assertEquals("abc", visited.toString());
    }
}

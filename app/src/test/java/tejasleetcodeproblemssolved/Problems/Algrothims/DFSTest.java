package tejasleetcodeproblemssolved.Problems.Algrothims;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import tejasleetcodeproblemssolved.Problems.Structures.Graph;
import tejasleetcodeproblemssolved.Problems.Structures.Graph.Node;

class DFSTest {

    // Check normal case: target found by exploring depth-first rather than level by level
    @Test void dfsVisitsNodesDepthFirstUntilTargetFound() {
        DFS.testGraph = new Graph();
        DFS.testGraph.addNode('a');
        DFS.testGraph.addNode('b');
        DFS.testGraph.addNode('c');
        DFS.testGraph.addNode('d');
        DFS.testGraph.addNode('e');
        DFS.testGraph.addNode('f');

        DFS.testGraph.addEdge('a', 'b');
        DFS.testGraph.addEdge('a', 'c');
        DFS.testGraph.addEdge('a', 'd');
        DFS.testGraph.addEdge('b', 'e');
        DFS.testGraph.addEdge('c', 'd');
        DFS.testGraph.addEdge('d', 'e');
        DFS.testGraph.addEdge('d', 'f');
        DFS.testGraph.addEdge('e', 'f');

        List<Node> order = DFS.DFSAlgrothim('a', 'd');
        StringBuilder visited = new StringBuilder();
        for(Node n : order) visited.append(n.value);

        assertEquals("ad", visited.toString());
    }

    // Check that DFS dives deep through the last-pushed branch before backtracking
    @Test void dfsDivesDeepThroughLastPushedBranch() {
        DFS.testGraph = new Graph();
        DFS.testGraph.addNode('a');
        DFS.testGraph.addNode('b');
        DFS.testGraph.addNode('c');
        DFS.testGraph.addNode('d');
        DFS.testGraph.addNode('e');
        DFS.testGraph.addNode('f');

        DFS.testGraph.addEdge('a', 'b');
        DFS.testGraph.addEdge('a', 'c');
        DFS.testGraph.addEdge('a', 'd');
        DFS.testGraph.addEdge('b', 'e');
        DFS.testGraph.addEdge('c', 'd');
        DFS.testGraph.addEdge('d', 'e');
        DFS.testGraph.addEdge('d', 'f');
        DFS.testGraph.addEdge('e', 'f');

        List<Node> order = DFS.DFSAlgrothim('a', 'f');
        StringBuilder visited = new StringBuilder();
        for(Node n : order) visited.append(n.value);

        assertEquals("adf", visited.toString());
    }

    // Check case where start node equals target node
    @Test void dfsReturnsSingleNodeWhenStartEqualsTarget() {
        DFS.testGraph = new Graph();
        DFS.testGraph.addNode('a');
        DFS.testGraph.addNode('b');
        DFS.testGraph.addEdge('a', 'b');

        List<Node> order = DFS.DFSAlgrothim('a', 'a');

        assertEquals(1, order.size());
        assertEquals('a', order.get(0).value);
    }

    // Check case where target is unreachable, traversal visits entire connected component
    @Test void dfsVisitsAllReachableNodesWhenTargetUnreachable() {
        DFS.testGraph = new Graph();
        DFS.testGraph.addNode('a');
        DFS.testGraph.addNode('b');
        DFS.testGraph.addNode('c');
        DFS.testGraph.addEdge('a', 'b');

        List<Node> order = DFS.DFSAlgrothim('a', 'z');

        assertEquals(2, order.size());
        assertEquals('a', order.get(0).value);
        assertEquals('b', order.get(1).value);
    }

    // Check single node graph with no edges
    @Test void dfsHandlesSingleNodeGraph() {
        DFS.testGraph = new Graph();
        DFS.testGraph.addNode('a');

        List<Node> order = DFS.DFSAlgrothim('a', 'a');

        assertEquals(1, order.size());
        assertEquals('a', order.get(0).value);
    }
}

package tejasleetcodeproblemssolved.Problems.Algrothims;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import tejasleetcodeproblemssolved.Problems.Structures.Graph;
import tejasleetcodeproblemssolved.Problems.Structures.Graph.Node;

public class BFS {
    static Graph testGraph = new Graph();

    public static List<Node> BFSAlgrothim(char startingNode, char targetNode){
        /**
         * Algrothim goes like this:
         * 2 lists, 1 Queue with current nodes, 1 queue with visited nodes
         * stop once Queue is empty
         * 
         */
        Queue<Node> current = new LinkedList<>();
        Set<Node> visited = new HashSet<>();
        List<Node> order = new ArrayList<>();
        
        current.add(testGraph.findNode(startingNode));

        while(!current.isEmpty()){
            Node node = current.remove();

            if(node == null || visited.contains(node)) continue;

            visited.add(node);
            order.add(node);
            if(node.value == targetNode) break;

            for(Node n : node.adjencyList){
                if(!(visited.contains(n))) current.add(n);
            }
        }
        
        return order;
    }

    public static void main(String[] args) {
        //Sample Graph 1
        testGraph.addNode('a');
        testGraph.addNode('b');
        testGraph.addNode('c');
        testGraph.addNode('d');
        testGraph.addNode('e');
        testGraph.addNode('f');

        testGraph.addEdge('a', 'b');
        testGraph.addEdge('a', 'c');
        testGraph.addEdge('a', 'd');
        testGraph.addEdge('b', 'e');
        testGraph.addEdge('c', 'd');
        testGraph.addEdge('d', 'e');
        testGraph.addEdge('d', 'f');
        testGraph.addEdge('e', 'f');
    
        System.out.println(testGraph);

        for(Node n : BFSAlgrothim('a', 'd')){
            System.out.print(n.value + " ");
        }
    }
}

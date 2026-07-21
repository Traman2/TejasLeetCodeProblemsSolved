package tejasleetcodeproblemssolved.Problems.Algrothims;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import tejasleetcodeproblemssolved.Problems.Structures.Graph;
import tejasleetcodeproblemssolved.Problems.Structures.Graph.Node;

public class DFS {
    static Graph testGraph = new Graph();
    
    public static List<Node> DFSAlgrothim(char startingNode, char targetNode){
        /**
         * Algrothim goes like this:
         * 2 lists, 1 stack with current nodes, 1 queue with visited nodes
         * stop once stack is empty
         * 
         */
        Stack<Node> current = new Stack<>();
        Set<Node> visited = new HashSet<>();
        List<Node> order = new ArrayList<>();

        current.push(testGraph.findNode(startingNode));
        while(!current.isEmpty()){
            Node processingNode = current.pop();

            if(processingNode == null || visited.contains(processingNode)) continue;

            visited.add(processingNode);
            order.add(processingNode);
            if(processingNode.value == targetNode) break;
            
            for(Node adj : processingNode.adjencyList){
                if(!visited.contains(adj)) current.push(adj);
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

        for(Node n : DFSAlgrothim('a', 'd')){
            System.out.print(n.value + " ");
        }
    }
}

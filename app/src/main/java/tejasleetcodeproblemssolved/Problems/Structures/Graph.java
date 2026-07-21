package tejasleetcodeproblemssolved.Problems.Structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Graph: 
 * This is a sample graph structure code
 * 
 */
public class Graph {
    Map<Character, Node> nodes = new HashMap<>();

    //Inner Node
    public static class Node {
        public char value;
        public List<Node> adjencyList = new ArrayList<>();

        Node(char val) {
            this.value = val;
        }
    }

    //Builder methods
    public void addNode(char node){
        nodes.putIfAbsent(node, new Node(node));

    }

    public void addEdge(char from, char to){
        Node a = findNode(from);
        Node b = findNode(to);

        if(a != null && b != null){
            a.adjencyList.add(b);
            b.adjencyList.add(a);
        }
    }

    public Node findNode(char node){
        return nodes.get(node);
    }

    @Override
    public String toString(){
        String ans = "";
        for(Node curNode : nodes.values()){
            ans += curNode.value + ": ";
            for(Node adjNode : curNode.adjencyList){
                ans += adjNode.value + " ";
            }
            ans += "\n";
        }
        return ans;
    }
}

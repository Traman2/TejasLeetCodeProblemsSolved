package tejasleetcodeproblemssolved.Problems.Mediums;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import tejasleetcodeproblemssolved.Problems.Structures.BinaryTreeNode;


public class BinaryTreeLevelOrder {
    public static List<List<Integer>> levelOrder(BinaryTreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            ArrayList<Integer> level = new ArrayList<>();

            for(int i = 0; i < levelSize; i++){
                BinaryTreeNode node = queue.poll();
                level.add(node.val);

                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);

            }
            result.add(level);            
        }

        return result;
    }

    public static void main(String[] args) {
        BinaryTreeNode node1 = new BinaryTreeNode(3);
        BinaryTreeNode node2 = new BinaryTreeNode(9);
        BinaryTreeNode node3 = new BinaryTreeNode(20);
        BinaryTreeNode node4 = new BinaryTreeNode(15);
        BinaryTreeNode node5 = new BinaryTreeNode(7);

        node1.addLeft(node2);
        node1.addRight(node3);
        node3.addLeft(node4);
        node3.addRight(node5);

        System.out.println(levelOrder(node1));
    }
}

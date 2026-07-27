package tejasleetcodeproblemssolved.Problems.Mediums;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import tejasleetcodeproblemssolved.Problems.Structures.BinaryTreeNode;

class BinaryTreeLevelOrderTest {

    // Check normal case
    @Test void levelOrderReturnsRowsTopToBottom() {
        BinaryTreeNode node1 = new BinaryTreeNode(3);
        BinaryTreeNode node2 = new BinaryTreeNode(9);
        BinaryTreeNode node3 = new BinaryTreeNode(20);
        BinaryTreeNode node4 = new BinaryTreeNode(15);
        BinaryTreeNode node5 = new BinaryTreeNode(7);

        node1.addLeft(node2);
        node1.addRight(node3);
        node3.addLeft(node4);
        node3.addRight(node5);

        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(3),
                Arrays.asList(9, 20),
                Arrays.asList(15, 7)
        );

        assertEquals(expected, BinaryTreeLevelOrder.levelOrder(node1));
    }

    //Check null case
    @Test void levelOrderReturnsEmptyListForNullRoot() {
        assertEquals(Arrays.asList(), BinaryTreeLevelOrder.levelOrder(null));
    }
}
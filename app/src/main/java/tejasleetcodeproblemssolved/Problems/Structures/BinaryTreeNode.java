package tejasleetcodeproblemssolved.Problems.Structures;

public class BinaryTreeNode {
    public int val;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode() {}
    public BinaryTreeNode(int val) { this.val = val; }
    public BinaryTreeNode(int val, BinaryTreeNode left, BinaryTreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    //Builder methods
    public void addLeft(BinaryTreeNode node){
        this.left = node;
    }

    public void addRight(BinaryTreeNode node){
        this.right = node;
    }

}
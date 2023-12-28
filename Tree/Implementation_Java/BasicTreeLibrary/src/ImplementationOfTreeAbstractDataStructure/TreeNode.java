package ImplementationOfTreeAbstractDataStructure;

public class TreeNode {
    TreeNode parentNode;
    TreeNode leftChild;
    TreeNode rightChild;
    int value;

    public TreeNode(TreeNode parentNode, TreeNode leftChild, TreeNode rightChild, int value){
        this.parentNode = parentNode;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.value = value;
    }

}

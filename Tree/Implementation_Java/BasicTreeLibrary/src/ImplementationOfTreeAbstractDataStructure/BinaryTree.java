package ImplementationOfTreeAbstractDataStructure;

import java.util.ArrayList;

//Binary Tree is implemented (Every node may have maximum 2 child, and they are not placed according to their value)
public class BinaryTree {

    //I used Arraylist for easy implementation. When I created Arraylist free structure, complexity was going up significantly for insert and delete operations
    ArrayList<TreeNode> tree;
    TreeNode rootNode;

    //Constructor for tree that sets root node
    public BinaryTree(int rootNodeValue) {
        tree = new ArrayList<>();
        rootNode = new TreeNode(null, null, null, rootNodeValue);
        tree.add(rootNode);
    }

    //Insertion of new node
    public void addNode(int nodeValue) {
        TreeNode parent;
        TreeNode newNode;
        int newNodeIndex = tree.size() + 1;
        if (newNodeIndex % 2 == 0) {
            parent = tree.get(newNodeIndex / 2 - 1);
            newNode = new TreeNode(parent, null, null, nodeValue);
            parent.leftChild = newNode;
        } else {
            parent = tree.get((newNodeIndex - 1) / 2 - 1);
            newNode = new TreeNode(parent, null, null, nodeValue);
            parent.rightChild = newNode;
        }
        tree.add(newNode);
    }

    //Removing the last node
    public void deleteLastNode() {
        tree.removeLast();
    }

    //Removing node by its value
    public void deleteNodeByValue(int nodeValue) {
        for (int i = 0; i < tree.size(); i++) {
            if (tree.get(i).value == nodeValue) {
                tree.remove(i);
                break;
            }
        }
    }

    //Updating value of the node by its old value
    public void updateNodeByValue(int nodeValue, int newValue) {
        for (TreeNode treeNode : tree) {
            if (treeNode.value == nodeValue) {
                treeNode.value = newValue;
                break;
            }
        }
    }

    //To see all the nodes in the Tree
    public void printAllNodes() {
        for (TreeNode treeNode : tree) {
            //For root node
            if (treeNode.parentNode == null) {
                System.out.println("Value : " + treeNode.value + " Parent : " + null + " Left Child : " + treeNode.leftChild.value + " Right Child : " + treeNode.rightChild.value);
            } else if (treeNode.leftChild == null && treeNode.rightChild == null) {
                System.out.println("Value : " + treeNode.value + " Parent : " + treeNode.parentNode.value + " Left Child : " + null + " Right Child : " + null);
            } else if (treeNode.leftChild == null) {
                System.out.println("Value : " + treeNode.value + " Parent : " + treeNode.parentNode.value + " Left Child : " + null + " Right Child : " + treeNode.rightChild.value);
            } else if (treeNode.rightChild == null) {
                System.out.println("Value : " + treeNode.value + " Parent : " + treeNode.parentNode.value + " Left Child : " + treeNode.leftChild.value + " Right Child : " + null);
            } else {
                System.out.println("Value : " + treeNode.value + " Parent : " + treeNode.parentNode.value + " Left Child : " + treeNode.leftChild.value + " Right Child : " + treeNode.rightChild.value);
            }
        }
    }

    //Travel types in the tree
    public void postOrderTraversal(TreeNode node) {
        if (node == null)
            return;

        postOrderTraversal(node.leftChild);

        postOrderTraversal(node.rightChild);

        System.out.print(node.value + " ");
    }

    public void inOrderTraversal(TreeNode node) {
        if (node == null)
            return;

        inOrderTraversal(node.leftChild);

        System.out.print(node.value + " ");

        inOrderTraversal(node.rightChild);
    }

    public void preOrderTraversal(TreeNode node) {
        if (node == null)
            return;

        System.out.print(node.value + " ");

        preOrderTraversal(node.leftChild);

        preOrderTraversal(node.rightChild);
    }

}

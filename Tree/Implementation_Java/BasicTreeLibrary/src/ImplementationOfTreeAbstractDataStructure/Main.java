package ImplementationOfTreeAbstractDataStructure;

public class Main {
    public static void main(String[] args) {

        //Initialization of tree
        BinaryTree tree = new BinaryTree(40);

        //Node insertions
        tree.addNode(76);
        tree.addNode(45);
        tree.addNode(31);
        tree.addNode(54);
        tree.addNode(73);
        tree.addNode(87);
        tree.addNode(9);
        tree.addNode(19);
        tree.addNode(34);
        tree.addNode(21);
        tree.addNode(55);
        tree.addNode(6);
        tree.addNode(64);
        tree.addNode(12);
        tree.addNode(1);

        //printing all the nodes
        tree.printAllNodes();

        //Traversal Types
        System.out.println("Inorder Traversal : ");
        tree.inOrderTraversal(tree.rootNode);
        System.out.println();
        System.out.println("Preorder Traversal : ");
        tree.preOrderTraversal(tree.rootNode);
        System.out.println();
        System.out.println("Postorder Traversal : ");
        tree.postOrderTraversal(tree.rootNode);
        System.out.println();

        //Removing last node
        tree.deleteLastNode();

        //Updating node by its old value
        tree.updateNodeByValue(12, 11);

        //Removing node by its value
        tree.deleteNodeByValue(11);

        //printing all the nodes
        tree.printAllNodes();
    }
}
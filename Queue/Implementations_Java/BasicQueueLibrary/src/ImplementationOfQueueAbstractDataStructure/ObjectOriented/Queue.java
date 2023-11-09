package ImplementationOfQueueAbstractDataStructure.ObjectOriented;

public class Queue {

    //Implementation is similar to linked list, elements are accessed from startNode
    //With the nextNode property elements are connected to each other
    //Also startNode is used to dequeue elements as well as endNode used to enqueue elements

    //Starting node of queue
    private Node startNode = null;

    //Last node of queue
    private Node endNode = null;

    //Prints queue nodes
    public void display(){
        Node pointer = startNode;
        if (pointer == null){
            System.out.println("There is no element to display in queue");
        }
        else{
            while (true){
                System.out.println(pointer.data);
                pointer = pointer.nextNode;
                if (pointer.nextNode==null){
                    System.out.println(pointer.data);
                    break;
                }
            }
        }
    }

    //Adding element to queue
    public void enqueue(int value){
        if (startNode == null){
            startNode = new Node(value, null);
        } else if (endNode == null) {
            Node newNode = new Node(value, null);
            endNode = newNode;
            startNode.nextNode = newNode;
        } else {
            Node newNode = new Node(value, null);
            endNode.nextNode = newNode;
            endNode = newNode;
        }
    }

    //Removing element from queue
    public void dequeue(){
        if (startNode == null){
            System.out.println("There is no element to dequeue in queue");
        } else if (startNode.nextNode == endNode) {
            startNode = endNode;
            endNode = null;
        } else {
            startNode = startNode.nextNode;
        }
    }

    //Gets front value in the queue
    public int peek(){
        if (startNode != null){
            return startNode.data;
        }
        else {
            return 0;
        }
    }

    //Gets last value in the queue
    public int rear(){
        if (endNode == null && startNode!= null){
            return startNode.data;
        }
        else if (endNode != null && startNode!= null){
            return endNode.data;
        }
        else {
            return 0;
        }
    }

    public boolean isEmpty(){
        return startNode == null;
    }
}

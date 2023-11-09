package ImplementationOfQueueAbstractDataStructure.WithLinkedList;

public class Main {
    public static void main(String[] args) {
        //Queue initialization
        Queue queue = new Queue();
        System.out.println(queue.isEmpty());
        //Adding element to queue (FIFO)
        queue.enqueue(15);
        queue.enqueue(25);
        queue.enqueue(35);
        queue.enqueue(45);
        queue.enqueue(55);
        queue.enqueue(65);
        System.out.println(queue.isEmpty());
        queue.display();
        //Removing element from queue (FIFO)
        queue.dequeue();
        queue.dequeue();
        queue.display();
        //Getting Front and last values of the queue
        System.out.println(queue.rear());
        System.out.println(queue.peek());
    }
}
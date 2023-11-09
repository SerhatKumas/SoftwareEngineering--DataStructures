package ImplementationOfQueueAbstractDataStructure.WithLinkedList;

import java.util.LinkedList;

public class Queue {

    //Implementation by using Linked List library and its methods

    LinkedList<Integer> queue = new LinkedList<>();

    //Prints queue nodes
    public void display(){
        if (queue.isEmpty()){
            System.out.println("There is no element to display in queue");
        }
        else{
            System.out.println(queue);
        }
    }

    //Adding element to queue
    public void enqueue(int value){
        queue.addLast(value);
    }

    //Removing element from queue
    public void dequeue(){
        queue.removeFirst();
    }

    //Gets first value in the queue
    public int peek(){
        if (queue.getFirst() != null){
            return queue.getFirst();
        }
        else {
            return 0;
        }
    }

    //Gets last value in the queue
    public int rear(){
        if (queue.getLast() != null){
            return queue.getLast();
        }
        else {
            return 0;
        }
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    }

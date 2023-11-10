package PredefinedQueueMethods;

import java.util.LinkedList;
import java.util.Queue;

public class PredefinedMethods {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        //Adding element to Queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);

        //Removing element to queue
        queue.remove();

        //Displaying element in the front of the queue
        System.out.println(queue.peek());

        //Displaying elements of the queue
        System.out.println(queue);

        // Printing the top element and removing it
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}

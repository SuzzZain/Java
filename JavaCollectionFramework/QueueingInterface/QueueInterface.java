package JavaCollectionFramework.QueueingInterface;

// A Queue is a collection used to hold multiple elements prior to processing. Queues typically order elements in a FIFO (First In First Out) manner.

// Implementations of Queue:
// PriorityQueue: Elements are ordered by their priority. Natural ordering or a custom comparator can be used.
// LinkedList: Can also be used as a queue with FIFO order.

import java.util.PriorityQueue;

public class QueueInterface {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(30);
        queue.add(10);
        queue.add(20);
        
        System.out.println(queue.poll()); // Retrieves and removes the head (smallest element), 10
        System.out.println(queue);        // Remaining elements: [20, 30]
    }
}

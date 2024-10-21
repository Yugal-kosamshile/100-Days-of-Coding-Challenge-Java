
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        // Create a Priority Queue (Min-Heap by default)
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the priority queue
        System.out.println("Inserting elements into the Priority Queue...");
        priorityQueue.add(3);
        priorityQueue.add(1);
        priorityQueue.add(4);
        priorityQueue.add(2);

        // Access the highest-priority element (the smallest one in this case)
        System.out.println("Highest-priority element: " + priorityQueue.peek());

        // Poll (remove) the highest-priority element
        System.out.println("Polling (removing) the highest-priority element: " + priorityQueue.poll());

        // Check the new highest-priority element after removal
        System.out.println("Highest-priority element after removal: " + priorityQueue.peek());
    }
}

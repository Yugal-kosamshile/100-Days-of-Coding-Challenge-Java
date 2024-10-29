class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CycleDetectionLinkedList {
    private Node head;

    // Add a new node to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Adding " + data);
    }

    // Method to detect cycle using Floyd's Cycle Detection Algorithm
    public boolean hasCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // Move slow pointer by 1 step
            fast = fast.next.next;      // Move fast pointer by 2 steps

            if (slow == fast) {         // Cycle detected
                return true;
            }
        }
        return false;
    }

    // Create a cycle for testing by connecting the last node to a given position
    public void createCycle(int position) {
        if (head == null) return;

        Node temp = head;
        Node cycleNode = null;
        int count = 0;

        while (temp.next != null) {
            if (count == position) {
                cycleNode = temp;
            }
            temp = temp.next;
            count++;
        }

        temp.next = cycleNode;  // Create a cycle
        System.out.println("Creating a cycle");
    }

    public static void main(String[] args) {
        CycleDetectionLinkedList list = new CycleDetectionLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Cycle detected: " + list.hasCycle());  // Should be false

        list.createCycle(1);  // Create a cycle for testing

        System.out.println("Cycle detected: " + list.hasCycle());  // Should be true
    }
}

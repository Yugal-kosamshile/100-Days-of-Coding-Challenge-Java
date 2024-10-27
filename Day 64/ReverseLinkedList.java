class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {
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
    }

    // Reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;   // Store the next node
            current.next = prev;   // Reverse the link
            prev = current;        // Move prev and current one step forward
            current = next;
        }
        head = prev;  // Update head to the new first node
    }

    // Display the linked list
    public void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty!");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? " -> " : ""));
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.print("Original Linked List: ");
        list.display();

        list.reverse();

        System.out.print("Reversed Linked List: ");
        list.display();
    }
}

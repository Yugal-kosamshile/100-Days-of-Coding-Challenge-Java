import java.util.ArrayList;
import java.util.List;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListToArray {
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

    // Method to convert linked list to array
    public int[] toArray() {
        List<Integer> tempArray = new ArrayList<>();
        Node temp = head;
        
        while (temp != null) {
            tempArray.add(temp.data);
            temp = temp.next;
        }

        // Convert ArrayList to int array
        int[] array = new int[tempArray.size()];
        for (int i = 0; i < tempArray.size(); i++) {
            array[i] = tempArray.get(i);
        }
        return array;
    }

    public static void main(String[] args) {
        LinkedListToArray list = new LinkedListToArray();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Convert to array and display
        int[] array = list.toArray();
        System.out.print("Linked List to Array: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}

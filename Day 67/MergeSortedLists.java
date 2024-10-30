class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeSortedLists {
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

    // Merge two sorted lists into a new sorted list
    public static Node merge(Node head1, Node head2) {
        Node dummy = new Node(0);  // Temporary dummy node
        Node tail = dummy;         // Tail to build the new list

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }

        // Attach remaining nodes
        if (head1 != null) {
            tail.next = head1;
        } else {
            tail.next = head2;
        }

        return dummy.next;
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
        MergeSortedLists list1 = new MergeSortedLists();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        MergeSortedLists list2 = new MergeSortedLists();
        list2.add(2);
        list2.add(4);
        list2.add(6);

        System.out.print("List 1: ");
        list1.display();

        System.out.print("List 2: ");
        list2.display();

        // Merging the lists
        Node mergedHead = merge(list1.head, list2.head);
        System.out.print("Merged List: ");
        
        // Displaying merged list
        while (mergedHead != null) {
            System.out.print(mergedHead.data + (mergedHead.next != null ? " -> " : ""));
            mergedHead = mergedHead.next;
        }
        System.out.println();
    }
}

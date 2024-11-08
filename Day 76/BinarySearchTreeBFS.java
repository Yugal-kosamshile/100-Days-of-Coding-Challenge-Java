import java.util.LinkedList;
import java.util.Queue;

class Node {
    int value;
    Node left, right;

    Node(int value) {
        this.value = value;
        left = right = null;
    }
}

class BinarySearchTreeBFS {
    Node root;

    // Insert a new value into the BST
    public void add(int value) {
        root = insertRec(root, value);
        System.out.println("Adding: " + value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) return new Node(value);
        if (value < root.value) root.left = insertRec(root.left, value);
        else if (value > root.value) root.right = insertRec(root.right, value);
        return root;
    }

    // Breadth-First Search (Level-Order Traversal)
    public void bfsTraversal() {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        System.out.print("BFS Traversal: ");
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.value + " ");

            // Add left and right children to the queue
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BinarySearchTreeBFS bst = new BinarySearchTreeBFS();
        bst.add(10);
        bst.add(5);
        bst.add(15);
        bst.add(3);
        bst.add(7);

        bst.bfsTraversal();
    }
}

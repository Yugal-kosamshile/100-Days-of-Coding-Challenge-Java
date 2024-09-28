import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    // Constructor to create a new node
    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class BalancedBST {

    // Method to check if the tree is balanced
    public static boolean isBalanced(Node root) {
        return checkHeight(root) != -1;
    }

    // Helper method to check the height and balance of the tree
    private static int checkHeight(Node node) {
        if (node == null) {
            return 0;
        }

        // Check the height of left and right subtrees
        int leftHeight = checkHeight(node.left);
        int rightHeight = checkHeight(node.right);

        // If either subtree is unbalanced, propagate -1 upwards
        if (leftHeight == -1 || rightHeight == -1) {
            return -1;
        }

        // If the current node is unbalanced, return -1
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        // Otherwise, return the height of the current node
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Method to insert a new node in the BST
    public static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an empty tree
        Node root = null;

        // Getting the number of nodes to insert
        System.out.print("Enter the number of nodes to insert: ");
        int n = scanner.nextInt();

        // Inserting nodes into the BST
        System.out.println("Enter the node values:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            root = insert(root, value);
        }

        // Checking if the BST is balanced
        if (isBalanced(root)) {
            System.out.println("The tree is balanced.");
        } else {
            System.out.println("The tree is not balanced.");
        }
        scanner.close();
    }
}

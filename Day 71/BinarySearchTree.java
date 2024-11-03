class Node {
    int value;
    Node left, right;

    Node(int value) {
        this.value = value;
        left = right = null;
    }
}

class BinarySearchTree {
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

    // In-order traversal of the BST
    public void inOrderTraversal() {
        System.out.print("In-Order Traversal: ");
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.value + " ");
            inOrderRec(root.right);
        }
    }

    // Search for a value in the BST
    public boolean search(int value) {
        return searchRec(root, value) != null;
    }

    private Node searchRec(Node root, int value) {
        if (root == null || root.value == value) return root;
        if (value < root.value) return searchRec(root.left, value);
        return searchRec(root.right, value);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(10);
        bst.add(5);
        bst.add(15);
        bst.add(7);

        bst.inOrderTraversal();
        System.out.println("Search for 7: " + (bst.search(7) ? "Found" : "Not found"));
        System.out.println("Search for 12: " + (bst.search(12) ? "Found" : "Not found"));
    }
}

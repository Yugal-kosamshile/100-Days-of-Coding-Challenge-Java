class Node {
    int value;
    Node left, right;

    Node(int value) {
        this.value = value;
        left = right = null;
    }
}

class BinarySearchTreeDFS {
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

    // In-order DFS Traversal
    public void inOrder() {
        System.out.print("In-Order Traversal: ");
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(Node node) {
        if (node != null) {
            inOrderRec(node.left);
            System.out.print(node.value + " ");
            inOrderRec(node.right);
        }
    }

    // Pre-order DFS Traversal
    public void preOrder() {
        System.out.print("Pre-Order Traversal: ");
        preOrderRec(root);
        System.out.println();
    }

    private void preOrderRec(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preOrderRec(node.left);
            preOrderRec(node.right);
        }
    }

    // Post-order DFS Traversal
    public void postOrder() {
        System.out.print("Post-Order Traversal: ");
        postOrderRec(root);
        System.out.println();
    }

    private void postOrderRec(Node node) {
        if (node != null) {
            postOrderRec(node.left);
            postOrderRec(node.right);
            System.out.print(node.value + " ");
        }
    }

    public static void main(String[] args) {
        BinarySearchTreeDFS bst = new BinarySearchTreeDFS();
        bst.add(10);
        bst.add(5);
        bst.add(15);
        bst.add(7);

        bst.inOrder();
        bst.preOrder();
        bst.postOrder();
    }
}

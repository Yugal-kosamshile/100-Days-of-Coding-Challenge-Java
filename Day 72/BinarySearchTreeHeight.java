class Node {
    int value;
    Node left, right;

    Node(int value) {
        this.value = value;
        left = right = null;
    }
}

class BinarySearchTreeHeight {
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

    // Calculate the height of the BST
    public int getHeight() {
        return findHeight(root);
    }

    private int findHeight(Node node) {
        if (node == null) return -1; // Base case for leaf nodes
        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        BinarySearchTreeHeight bst = new BinarySearchTreeHeight();
        bst.add(10);
        bst.add(5);
        bst.add(15);
        bst.add(7);

        System.out.println("Height of the BST: " + bst.getHeight());
    }
}

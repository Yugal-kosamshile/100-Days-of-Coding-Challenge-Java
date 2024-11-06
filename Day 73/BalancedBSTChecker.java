class Node {
    int value;
    Node left, right;

    Node(int value) {
        this.value = value;
        left = right = null;
    }
}

class BalancedBSTChecker {
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

    // Check if the tree is balanced
    public boolean isBalanced() {
        return checkBalance(root) != -1;
    }

    private int checkBalance(Node node) {
        if (node == null) return 0;

        int leftHeight = checkBalance(node.left);
        if (leftHeight == -1) return -1;

        int rightHeight = checkBalance(node.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        BalancedBSTChecker bst = new BalancedBSTChecker();
        bst.add(10);
        bst.add(5);
        bst.add(15);
        bst.add(7);

        System.out.println("Is the BST balanced? " + (bst.isBalanced() ? "Yes" : "No"));
    }
}

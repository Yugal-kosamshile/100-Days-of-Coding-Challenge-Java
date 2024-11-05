class Node {
    int value;
    Node left, right;

    Node(int value) {
        this.value = value;
        left = right = null;
    }
}

class LowestCommonAncestorBST {
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

    // Find the LCA of two nodes in the BST
    public Node findLCA(int n1, int n2) {
        return findLCARec(root, n1, n2);
    }

    private Node findLCARec(Node node, int n1, int n2) {
        if (node == null) return null;

        // If both nodes are greater than the current node, LCA is in the right subtree
        if (node.value < n1 && node.value < n2) return findLCARec(node.right, n1, n2);

        // If both nodes are less than the current node, LCA is in the left subtree
        if (node.value > n1 && node.value > n2) return findLCARec(node.left, n1, n2);

        // If neither of the above cases, the current node is the LCA
        return node;
    }

    public static void main(String[] args) {
        LowestCommonAncestorBST bst = new LowestCommonAncestorBST();
        bst.add(20);
        bst.add(10);
        bst.add(30);
        bst.add(5);
        bst.add(15);

        Node lca = bst.findLCA(5, 15);
        System.out.println("The LCA of 5 and 15 is: " + (lca != null ? lca.value : "Not found"));

        lca = bst.findLCA(10, 30);
        System.out.println("The LCA of 10 and 30 is: " + (lca != null ? lca.value : "Not found"));
    }
}

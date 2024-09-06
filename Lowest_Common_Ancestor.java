// Find the Lowest Common Ancestor in a Binary Search Tree.

class TreeNode {
    int value;
    TreeNode left, right;

    TreeNode(int value) {
        this.value = value;
        left = right = null;
    }
}

public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null) return null;
    if (root.value > p.value && root.value > q.value) {
        return lowestCommonAncestor(root.left, p, q);
    } else if (root.value < p.value && root.value < q.value) {
        return lowestCommonAncestor(root.right, p, q);
    } else {
        return root;
    }
}

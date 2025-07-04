package com.SpringSystem.Delottie;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}
public class Is_bst_tree {
    public boolean isValidBst(TreeNode root) {
        return isValidBst(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean isValidBst(TreeNode node, long min, long max) {
        if(node == null) return  true;
        if(node.val <= min || node.val >= max) return  false;

        return isValidBst(node.left, min, node.val) && isValidBst(node.right, node.val, max);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        Is_bst_tree validator = new Is_bst_tree();
        System.out.println("Is valid bst "+validator.isValidBst(root));
    }
}

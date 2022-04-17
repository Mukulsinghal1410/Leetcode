/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode res = new TreeNode(-1);
    public TreeNode increasingBST(TreeNode root) {
        TreeNode store = res;
        inorder(root);
        return store.right;
    }
    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        res.right = new TreeNode(root.val);
        res = res.right;
        inorder(root.right);
    }
}
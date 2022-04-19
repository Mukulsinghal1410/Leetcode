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
    TreeNode prev = null;TreeNode first = null; TreeNode second = null;
    
    public void inorderHelper(TreeNode root)
    {
        if(root == null)  return;
        
        inorderHelper(root.left);
        
        if(first == null && prev != null && prev.val >= root.val)
            first = prev;
        
        if(first != null && prev.val >= root.val)
            second = root;
        
        prev = root;
        
        inorderHelper(root.right);
    }
    
    public void swap(TreeNode first, TreeNode second)
    {
        int temp = first.val;
        
        first.val = second.val;
        second.val = temp;
    }
    
    public void recoverTree(TreeNode root)
    {
        prev = null; first = null; second = null;
        
        inorderHelper(root);
        
        swap(first,second);
    
    }
}
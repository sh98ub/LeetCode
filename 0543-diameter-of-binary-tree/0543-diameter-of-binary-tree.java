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
    int max=0;
    public int helper(TreeNode root){
        if(root==null) return 0;

        int lc=helper(root.left);
        int rc=helper(root.right);
        max=Math.max(max,lc+rc);

        return Math.max(lc,rc)+1;


    }
    public int diameterOfBinaryTree(TreeNode root) {

        helper(root);

        return max;
        
    }
}
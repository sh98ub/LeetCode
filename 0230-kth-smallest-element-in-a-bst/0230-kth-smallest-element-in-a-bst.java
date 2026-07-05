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

    public void helper(TreeNode root, int k , int[] res, int[] count){

        if(root==null) return;
         helper(root.left,k, res, count);
         count[0]++;

         if(count[0]==k){
            res[0]=root.val;

            return;
         }

         helper(root.right,k,res, count);

         


    }
    public int kthSmallest(TreeNode root, int k) {

        int result[]=new int[1];
        int count[]=new int[1];

        helper(root,k, result, count);

        return result[0];

        
    }
}
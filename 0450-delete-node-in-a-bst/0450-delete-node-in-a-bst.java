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

    public TreeNode helper(TreeNode root){

        while(root.left!=null){
            root=root.left;
        }

        return root;

        

        
    }
    public TreeNode delete(TreeNode root, int key){
        if(root==null) return null;

        
        

        if (root.val>key){
         root.left= delete(root.left, key);
        }else if(key > root.val){

         root.right=delete(root.right, key);
        }else{
            if(root.left==null && root.right==null){
             return   root=null;
            
            }else if(root.left==null|| root.right==null){
                return root.left!=null?root.left:root.right;

            }else{
             TreeNode ans=  helper(root.right);
             root.val=ans.val;
             root.right = delete(root.right, ans.val);

            }

            return root;
            

        }

        return root;

    
       


    }


    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
         

          return delete(root,key);


        
    }
}
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

    HashMap<Integer, Integer> map=new HashMap<>();
    private int[] postorder;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.postorder=postorder;
        int n=inorder.length;

        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i], i);
        }
        return build(n-1, 0, 0, n-1);
        
    }


    public TreeNode build (int postStart,int postEnd,int  inStart,int inEnd){
        if(postStart<postEnd || inStart>inEnd){
            return null;
        }
        TreeNode root=new TreeNode(postorder[postStart]);

        int rootindex=map.get(root.val);

        int rightsize=inEnd-rootindex;

        root.right=build(postStart-1,postStart-rightsize , rootindex+1, inEnd);

        root.left=build(postStart-rightsize-1,postEnd ,inStart,rootindex-1);


        return root;


    }
}
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
    private int[] preorder;
           private HashMap<Integer,Integer> map=new HashMap<>();


    public TreeNode build(int preStart, int preEnd,int inStart, int inEnd){
        if(preStart>preEnd || inStart>inEnd){
            return null;
        }
        TreeNode root=new TreeNode(preorder[preStart]);
        int idx=map.get(root.val);
        int leftsize=idx-inStart;


        root.left= build(preStart+1,preStart+leftsize,inStart,idx-1);

        root.right=build(preStart+leftsize+1, preEnd, idx+1,inEnd);

        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder=preorder;

        int n=inorder.length;

        for(int i=0;i<n;i++){
            map.put(inorder[i],i);
        }

        return  build(0,n-1,0,n-1);
        
    }
}
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
    class Pair{
        TreeNode node;
        long index;
         Pair(TreeNode node, long index) {
        this.node = node;
        this.index = index;
    }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 1;

Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0L));
        int ans=0;

        while(!q.isEmpty()){
            int n=q.size();
            long minIndex = q.peek().index;


            long first=0;
            long last=0;

            for(int i=0;i<n;i++){
                Pair p=q.poll();
                TreeNode node=p.node;
                long idx=p.index;

                long curr=idx-minIndex;
                if(node.left!=null){

                q.offer(new Pair(node.left, 2*curr + 1));
                }
                if(node.right!=null){
                q.offer(new Pair(node.right, 2*curr + 2));
                }

                if(i==0){
                    first=curr;
                }
                if(i==n-1){
                    last=curr;
                }
                
            }
            ans = Math.max(ans, (int)(last - first + 1));

        }

        return ans;


        
    }
}
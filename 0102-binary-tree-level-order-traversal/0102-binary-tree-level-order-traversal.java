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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> result=new ArrayList<>();

        if(root==null){
            return result;
        }
        q.add(root);

        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> list=new ArrayList<>();

            for(int i=0;i<n;i++){
                TreeNode curr=q.poll();

                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                list.add(curr.val);

            }
            result.add(list);
        }

        return result;
        
    }
}
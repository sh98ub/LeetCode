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
          TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map=new TreeMap<>();

public void dfs(TreeNode root, int col, int row){

    if(root==null) return;
if (!map.containsKey(col))
    map.put(col, new TreeMap<>());

if (!map.get(col).containsKey(row))
    map.get(col).put(row, new PriorityQueue<>());

    map.get(col).get(row).offer(root.val);

    dfs(root.left, col-1,row+1 );

    dfs(root.right,col+1,row+1);

 }   public List<List<Integer>> verticalTraversal(TreeNode root) {

        List<List<Integer>> result=new ArrayList<>();

        if(root==null) return result;

        dfs(root,0,0);

        for (Map.Entry<Integer, TreeMap<Integer, PriorityQueue<Integer>>> colEntry : map.entrySet()) {

    TreeMap<Integer, PriorityQueue<Integer>> rows = colEntry.getValue();
     List<Integer> list=new ArrayList<>();

    for (Map.Entry<Integer, PriorityQueue<Integer>> rowEntry : rows.entrySet()) {
        Integer row = rowEntry.getKey();
    PriorityQueue<Integer> pq = rowEntry.getValue();

   

    while (!pq.isEmpty()) {
        list.add(pq.poll());
    }

  

    }
      result.add(list);
}

return result;


        
    }
}
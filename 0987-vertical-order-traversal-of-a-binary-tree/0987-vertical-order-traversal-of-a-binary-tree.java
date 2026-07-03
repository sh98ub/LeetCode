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
    class Pair {
        TreeNode node;
        int row;  // y-coordinate (depth)
        int col;  // x-coordinate (hd)

        Pair(TreeNode node, int row, int col) {
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        // Map<col, List of [row, value]>
        TreeMap<Integer, List<int[]>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0, 0));

        while (!q.isEmpty()) {
            Pair curr = q.poll();
            TreeNode node = curr.node;

            map.putIfAbsent(curr.col, new ArrayList<>());
            map.get(curr.col).add(new int[]{curr.row, node.val});

            if (node.left != null) {
                q.add(new Pair(node.left, curr.row + 1, curr.col - 1));
            }
            if (node.right != null) {
                q.add(new Pair(node.right, curr.row + 1, curr.col + 1));
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        for (List<int[]> list : map.values()) {
            // Sort by row first, then value
            Collections.sort(list, (a, b) -> {
                if (a[0] == b[0]) return a[1] - b[1]; // same row → sort by value
                return a[0] - b[0]; // sort by row
            });

            List<Integer> colVals = new ArrayList<>();
            for (int[] arr : list) {
                colVals.add(arr[1]);
            }
            result.add(colVals);
        }

        return result;
    }
}

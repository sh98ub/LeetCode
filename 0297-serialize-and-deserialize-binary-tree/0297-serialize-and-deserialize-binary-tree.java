/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

private int idx;
    StringBuilder result=new StringBuilder();

    public TreeNode build( String[]  data){
        

        String ch=data[idx];
        idx++;

if (ch.equals("#")) return null;
        TreeNode root=new TreeNode(Integer.parseInt(ch));

      root.left=  build(data);
      root.right=  build(data);

        return root;



    }


    // Encodes a tree to a single string.
    public String serialize(TreeNode root) { 
        if(root==null){
         result.append("#,");
         return result.toString();
            
        }
        result.append(root.val);
        result.append(',');

        serialize(root.left);
        serialize(root.right);

        return new String(result);


        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        String[] token=data.split(",");
        idx=0;
      
 return build(token);
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
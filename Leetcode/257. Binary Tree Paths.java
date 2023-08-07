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
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> list = new ArrayList<String>();

        if(root == null) return null;

        if(root.left == null && root.right == null){
            list.add(Integer.toString(root.val));
            return list;
        }

        dfs(root, "", list);

        for(int i = 0; i<list.size(); i++){
            list.set(i, list.get(i).substring(2));
        }
        return list;

    }

    //This is the function we used by recurrsion to travel to each node of the binary tree.
    public void dfs(TreeNode root, String s, List<String> list){
        if(root == null) return;

        if(root.left == null && root.right == null){
            list.add(s + "->" + root.val);
        }
        s = s + "->" + root.val;
  
        dfs(root.left, s, list);
        dfs(root.right, s, list);
        
    }

}

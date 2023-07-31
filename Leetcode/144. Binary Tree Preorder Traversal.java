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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();

        if(root == null) return list;

        traversal(root, list);

        return list;
    }

    //this function just traverse the binary tree and add it to the list in the preorder sequence 
    public void traversal(TreeNode root, List<Integer> list){
        if(root == null) return;

        list.add(root.val);

        traversal(root.left, list);
        traversal(root.right, list);
    }
}

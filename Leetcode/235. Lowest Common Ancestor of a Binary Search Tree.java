/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       int min = Math.min(p.val, q.val);
        int max = Math.max(p.val, q.val);
        return lowestCommonAncestor(root, min, max);
    }
    private TreeNode lowestCommonAncestor(TreeNode root, int min, int max) {
        if (root.val >= min && root.val <= max) {
            return root;
        }
        if (root.val > max) {
            return lowestCommonAncestor(root.left, min, max);
        }
        if (root.val < min) {
            return lowestCommonAncestor(root.right, min, max);
        }
        return null;
    }
}

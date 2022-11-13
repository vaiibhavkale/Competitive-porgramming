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

//Recursive

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return same(p, q);
    }
    public boolean same(TreeNode a, TreeNode b){
        if(a == null && b == null) return true;
        if(a == null || b == null) return false;
        
        return (a.val == b.val) && same(a.left, b.left) && same(a.right, b.right);
    }
}

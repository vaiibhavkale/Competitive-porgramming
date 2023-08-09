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
    boolean answer = true;

    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return false;

        return check(root, root.val);
    }

    public boolean check(TreeNode root, int value){
        if(root == null) return answer;
        if(answer == false) return answer;

        if(root.left != null){
            if(value != root.left.val) answer = false;
            check(root.left, value);
        }
        if(root.right != null){
            if(value != root.right.val) answer = false;
            check(root.right, value);
        }
        return answer;
    }
}















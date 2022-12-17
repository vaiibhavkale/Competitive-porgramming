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

// Recursive 

class Solution {
    int range_sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
        range_sum = 0;
        get_range_sum(root, low, high);
        return range_sum;
    }

    public void get_range_sum(TreeNode root, int low, int high){
        if(root != null){
            if(root.val >= low && root.val <= high){
                range_sum += root.val;
            }
            if(root.val > low){
                get_range_sum(root.left, low, high);
            }
            if(root.val < high){
                get_range_sum(root.right, low, high);
            }
        }
    }
}

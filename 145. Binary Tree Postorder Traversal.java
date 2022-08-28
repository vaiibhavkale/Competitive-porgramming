class Solution {
    
    List<Integer> output_arr = new ArrayList<>();
    
    public List<Integer> postorderTraversal(TreeNode root) {
        
        if(root == null) return output_arr;
        
        if(root != null) postorder(root);
        
        return output_arr;
    }
    
    public void postorder(TreeNode post){
        if(post.left != null) postorder(post.left);
        
        if(post.right != null) postorder(post.right);
        
        output_arr.add(post.val);
    }
}

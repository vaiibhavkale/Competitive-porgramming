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

_______________________________________________________________________________________

class Solution {
    
    public List<Integer> inorderTraversal(TreeNode root) {
        
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> output_arr = new ArrayList<>();
        
        if(root == null) return output_arr;
        
        TreeNode current = root;
        
        while(current!=null || !stack.isEmpty()){
            while(current!=null){
                stack.push(current);
                current = current.left;
            }
            
            current = stack.pop();
            output_arr.add(current.val);
            current = current.right;
        }
        
        return output_arr;
    }
}


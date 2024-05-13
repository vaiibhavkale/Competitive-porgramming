class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode root = construct(nums, 0, nums.length -1);
        return root;
    }
    
    public static TreeNode construct(int[] arr, int start, int end){
        if(start > end){
            return null;
        }
        
        if(start == end){
            int var = arr[start];
            return new TreeNode(var);
        }
        
        int index = maximum(arr, start, end);
        TreeNode root = new TreeNode(arr[index]);
        root.left = construct(arr, start, index-1);
        root.right = construct(arr, index+1, end);
        
        return root;
    }
    
    public static int maximum(int[] arr, int start, int end){
            int max = Integer.MIN_VALUE;
            int index = -1;
            for(int i = start; i<=end; i++){
                if(arr[i]>max){
                    max = arr[i];
                    index = i;
                }
            }
           return index;
        }
}

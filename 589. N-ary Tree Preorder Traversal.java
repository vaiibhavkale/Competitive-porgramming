class Solution {
    public List<Integer> preorder(Node root) {
        
        LinkedList<Node> stack = new LinkedList<>();
        List<Integer> output_arr = new ArrayList<>();
        
        if(root == null) return output_arr;
        
        stack.add(root);
        while(!stack.isEmpty()){
            Node node = stack.pollLast();
            output_arr.add(node.val);
            Collections.reverse(node.children);
          
            for(Node child: node.children){
                stack.add(child);
            }
        }
        return output_arr;
    }
}

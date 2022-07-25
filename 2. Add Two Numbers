class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode(0);
        ListNode first = l1, second = l2, current = answer;
        int carry = 0;
        
        while(first != null || second != null){
             
            int x = (first != null) ? first.val : 0;
            int y = (second != null) ? second.val : 0;
            
            int sum = carry + x + y;
            carry = sum/10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            
            if(first != null){ 
                first = first.next;
            }
            if(second != null){
                second = second.next;
            }
        }
        
        if(carry>0){
            current.next = new ListNode(carry);
        }
        
        return answer.next;
    }
}

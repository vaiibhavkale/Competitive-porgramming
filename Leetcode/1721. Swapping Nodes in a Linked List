class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode front = head, tail = head, slow = head; 
        
        while(k > 1){
            front = front.next;
            tail = tail.next;
            k--;
        }
        while(tail.next != null){
            slow = slow.next;
            tail = tail.next;
        }
        int temp = front.val;
        front.val = slow.val;
        slow.val = temp;
        
        return head;
    }
}

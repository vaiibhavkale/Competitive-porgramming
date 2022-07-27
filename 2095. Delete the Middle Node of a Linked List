class Solution {
    public ListNode deleteMiddle(ListNode head) {
        
        ListNode newlist = new ListNode(0, head);
        ListNode fast = newlist;
        ListNode slow = newlist;
        ListNode previous = slow;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
        }
        
        slow.next = slow.next.next;
        return newlist.next;
    }
}

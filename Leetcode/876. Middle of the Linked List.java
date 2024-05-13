class Solution {
    public ListNode middleNode(ListNode head) {
        
        int count = 0;
        ListNode temp = head;
        
        while(temp != null){
            count++;
            temp = temp.next;
        }
        
        count/=2;
        int i =0;
        ListNode answer = new ListNode(0);
        
        while(i <= count){
            answer = head;
            head = head.next;
            i++;
        }
        
        return answer;
    }
}

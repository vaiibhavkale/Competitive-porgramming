/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null){
            return head;
        }
        
        int length = size(head);
        int loop = length - (k % length);
        
        if(length == 1 || loop == length){
            return head;
        }
        
        int j = 0;
        ListNode temp = head;
        ListNode firstAddress = head;
        
        while(temp!=null){
            j++;
            if(j==loop){
                firstAddress = temp.next;
                temp.next = null;
                break;
            }
            temp = temp.next;
        }
        
        temp = firstAddress;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        return firstAddress;
    }
    
    public int size(ListNode head){
        
        int length = 0;
        while(head!= null){
            length++;
            head = head.next;
        }
        return length;
    }
}

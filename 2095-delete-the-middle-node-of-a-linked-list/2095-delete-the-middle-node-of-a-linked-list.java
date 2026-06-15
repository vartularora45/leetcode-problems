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
    public ListNode deleteMiddle(ListNode head) {
        ListNode n = head;
        if(head == null || head.next == null) return null;
        int c = 0;
        while(n != null){
            n = n.next;
            c++;
            
        }
        c = c / 2;
        n = head;
        for(int i=0;i<c-1;i++){
            n = n.next;
        }
        n.next = n.next.next;
        return head;
    }
}
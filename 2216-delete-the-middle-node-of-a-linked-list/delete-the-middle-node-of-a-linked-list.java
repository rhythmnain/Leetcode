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
        int count = 0;
        ListNode current = head;

        while (current != null){
            count++;
            current = current.next;
        }
        current = head;
        if(count == 1){
            return current.next;
        }
        int n = (count / 2) - 1;
        for(int i = 0; i < n; i++){
            current = current.next;
        }
        
        current.next = current.next.next;
        return head;
    }
}
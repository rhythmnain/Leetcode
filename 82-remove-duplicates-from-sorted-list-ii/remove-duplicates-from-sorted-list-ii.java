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
    public ListNode deleteDuplicates(ListNode head) {
    if(head==null){
        return null;
     }
     if(head.next == null) return head;
    ListNode prev=null;
    ListNode current=head;
    ListNode next=current.next;
    while(current.next!=null){
        if(current.val!=next.val){
            prev=current;
            current=next;
            if(next!=null){
                next=next.next;
            }
        }
        else{
            while(current!=null){
                next=next.next;
                if(next==null){
                    if(prev!=null){
                        prev.next=null;
                    }
                    else{
                        return null;
                    }
                    return head;
                }
                if(current.val!=next.val){
                    current=next;
                    next=next.next;
                    if(prev!=null){
                        prev.next=current;
                    }
                    else{
                        head=current;
                    }
                     break;
                }
            }
        }
    }

        return head;
    }
}

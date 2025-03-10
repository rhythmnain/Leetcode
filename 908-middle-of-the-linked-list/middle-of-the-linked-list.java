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
    public ListNode middleNode(ListNode head) {

//FIRST APPROACH
           ListNode s = head;
           ListNode f = head;

           while(f!= null && f.next != null){
            s = s.next;
            f = f.next.next;
           }        
           return s;
    }
}

// SECOND APPROACH 
// class Solution {
//     public ListNode middleNode(ListNode head) {
//         if (head == null || head.next == null)
//             return head;

//         ListNode fast = head;
//         ListNode slow = head;

//         while (fast != null) {
//             fast = fast.next;
//             if (fast != null) {
//                 fast = fast.next;
//                 slow = slow.next;
//             }
//         }

//         return slow;
//     }
// }
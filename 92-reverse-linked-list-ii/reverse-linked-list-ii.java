// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// //FIRST APPROACH
// class Solution {
//     public ListNode reverseBetween(ListNode head, int left, int right) {
//         if(left == right){
//             return head;
//         }
//         //skip the first left-1 node
//         ListNode curr= head;
//         ListNode prev = null;
//         for(int i =0; curr!= null && i<left-1; i++){
//             prev = curr;
//             curr = curr.next;
//         }
//         ListNode last = prev;
//         ListNode end = curr;

//         //reverse between the left and right
//         ListNode next = curr.next;
//         for(int i =0; curr!= null && i<right-left+1; i++){
//             prev = curr;
//             curr = next;
//             if(next!=null){
//                 next = next.next;
//             } 
//         }
//         if(last!= null){
//             last.next=prev;
//         } else{
//             head = prev;
//         }
//         end.next = curr;
//         return head;
//     }
// }
// //SECOND APPROACH 

// // class Solution {
// //     public ListNode reverseBetween(ListNode head, int left, int right) {
// //         if(head == null || head.next == null) return head;
// //         ListNode dummy = new ListNode(-1);
// //         dummy.next = head;
// //         ListNode it = dummy;
// //         ListNode prevIt = null;
       
// //         for(int i = 0; i < left; i++){
// //             prevIt = it;
// //             it = it.next;
// //         }
// //         ListNode prevItR = prevIt;
// //         ListNode itR = it;
       
// //         for(int i = left; i <= right; i++){
          
// //             ListNode forward = itR.next;
// //             itR.next = prevItR;
// //             prevItR = itR;
// //             itR = forward;
// //         }
        
// //         prevIt.next = prevItR;
// //         it.next = itR;
// //         return dummy.next;
        
// //     }
// // }


class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head; // No need to reverse if left equals right
        }

        // Create a dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // Move prev to the node before the left position
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        // Start reversing from the left position
        ListNode curr = prev.next; // First node to be reversed
        ListNode next = curr.next;  // Node after curr

        // Reverse the nodes between left and right
        for (int i = 0; i < right - left; i++) {
            curr.next = next.next; // Link to the next node in the original list
            next.next = prev.next;  // Link next to the start of the reversed part
            prev.next = next;       // Move next to the front of the reversed part
            next = curr.next;       // Update next
        }

        return dummy.next; // Return the new head, which might be different
    }
}

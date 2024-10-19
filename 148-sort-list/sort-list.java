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
//FIRST APPROACH
class Solution {
  public ListNode sortList(ListNode head) {
     if (head == null || head.next == null) {
            return head;
        }

        // Get the midpoint and split the list
        ListNode mid = getMid(head);
        ListNode left = sortList(head); // Sort the left half
        ListNode right = sortList(mid);  // Sort the right half

        // Merge the sorted halves
        return merge(left, right);
    }

    // Merge two sorted linked lists
    ListNode merge(ListNode list1, ListNode list2) {
        ListNode dh = new ListNode(0); // Dummy head
        ListNode tail = dh;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next; // Move tail
        }
        
        // Attach the remaining elements
        tail.next = (list1 != null) ? list1 : list2;
        return dh.next; // Return the merged list, skipping the dummy head
    }

    // Find the midpoint of the list using the slow and fast pointer approach
    ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        
        ListNode mid = midPrev.next; // Mid is the next of midPrev
        midPrev.next = null; // Split the list into two halves
        return mid;
    }
}


// SECOND APPROACH  
// class Solution {
  
//   public ListNode sortList(ListNode head) {
//     if (head == null || head.next == null)
//       return head;
        
//     ListNode prev = null, slow = head, fast = head;
    
//     while (fast != null && fast.next != null) {
//       prev = slow;
//       slow = slow.next;
//       fast = fast.next.next;
//     }
    
//     prev.next = null;
    

//     ListNode l1 = sortList(head);
//     ListNode l2 = sortList(slow);
//     return merge(l1, l2);
//   }
  
//   ListNode merge(ListNode l1, ListNode l2) {
//     ListNode l = new ListNode(0), p = l;
    
//     while (l1 != null && l2 != null) {
//       if (l1.val < l2.val) {
//         p.next = l1;
//         l1 = l1.next;
//       } else {
//         p.next = l2;
//         l2 = l2.next;
//       }
//       p = p.next;
//     }
    
//     if (l1 != null)
//       p.next = l1;
    
//     if (l2 != null)
//       p.next = l2;
    
//     return l.next;
//   }

// }
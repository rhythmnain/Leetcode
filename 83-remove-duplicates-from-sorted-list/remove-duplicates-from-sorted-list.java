class Solution {
   public ListNode deleteDuplicates(ListNode head) {
        // ListNode current = head;

        // while (current != null && current.next != null) {
        //     if (current.val == current.next.val) {
        //         current.next = current.next.next;
        //     } else {
        //         current = current.next;
        //     }
        // }

        // return head;
        if(head==null || head.next==null)
        return head;
        ListNode node = head;
        while(node.next!= null){
            if(node.val==node.next.val){
                node.next=node.next.next;
            }else{
                node=node.next;
            }
        }
       return head;
    }
}
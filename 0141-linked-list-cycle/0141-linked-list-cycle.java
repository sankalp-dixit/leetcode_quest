/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            return true;
            }
            return false;
    //     HashMap<ListNode,Integer> h= new HashMap<>(); 
    //     while(temp!=null){
    //         if(h.containsKey(temp))
    //         return true;
    //         h.put(temp,1);
    //         temp=temp.next;
    //     }
    //     return false;
    // } @@@@@@@@@@ 0(2nlogn)
}
}
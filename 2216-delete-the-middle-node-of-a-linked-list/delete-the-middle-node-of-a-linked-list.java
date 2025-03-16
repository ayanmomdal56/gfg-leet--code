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
 if (head == null || head.next == null) {
            return null;
        }

ListNode slow=head;
ListNode first = head.next.next; 
//  first=first.next;
while(first!=null && first.next!=null){
    slow=slow.next;
    first=first.next.next;

}
slow.next=slow.next.next;
        return head;
    }
}
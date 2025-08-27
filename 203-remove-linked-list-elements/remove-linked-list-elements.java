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
    public ListNode removeElements(ListNode head, int val) {

        // ListNode demo= new ListNode();
         while (head!=null && head.val == val) {
            head=head.next;
        }
ListNode temp =head;
// if(temp==null){
//     return null;
// }


while(temp!=null && temp.next!=null  ){
if(temp.next.val==val){
    temp.next=temp.next.next;
    // temp=temp.next;
} 
else
 {
                temp=temp.next;

}
// temp=temp.next;
}
return head;



    }
}
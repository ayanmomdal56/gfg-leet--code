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
    public boolean isPalindrome(ListNode head) {

if(head==null ){
    return true;

}
if(head.next==null){
    return true;

}

ListNode fast=head;
ListNode slow= head;


while(fast!=null && fast.next!=null){
slow=slow.next;
fast=fast.next.next;

}
ListNode prev=null;
ListNode cur=slow;

while(cur!=null){
ListNode n=cur.next;
cur.next=prev;
prev=cur;
cur=n;

}


ListNode first=head;
ListNode sec=prev;



while(sec!=null){
if(first.val!=sec.val){
return false;
}
first = first.next;
sec=sec.next;
}




        return true;
    }
}
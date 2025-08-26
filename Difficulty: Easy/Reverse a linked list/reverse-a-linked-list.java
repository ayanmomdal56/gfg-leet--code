/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        
        
Node temp=head;
Node prev=null;
Node front;


while(temp!=null){
    
   front =temp.next;
    temp.next=prev;
    prev=temp;
    temp=front;
    
    
    
}
    
    
    return prev;
        
    }
}
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
    public Node insertAtFront(Node head, int x) {

Node nextNode = new Node(x);
if(head==null){
    return nextNode;
}
Node temp=head;
nextNode.next=temp;
head=nextNode;



return head;
    }
}
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
    public Node insertPos(Node head, int pos, int val) {


Node nextNode= new Node(val);


if(pos==1){
nextNode.next=head;
return nextNode;
}


Node temp=head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {

    temp=temp.next;
    
}
if(temp!=null){
    nextNode.next=temp.next;
    temp.next=nextNode;
    
}
return head;




    }
}
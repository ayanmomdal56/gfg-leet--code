/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {

        Node prev=null;
int c=1;
if(x==1){
head=head.next;
return head;
}

Node temp=head;
while(temp!=null){
    if(c==x){
    prev.next=temp.next;
    break;
}

           prev=temp;      
            temp=temp.next; 
            c++;  
}

return head;

    }
}
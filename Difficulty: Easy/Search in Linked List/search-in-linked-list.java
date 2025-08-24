// User function Template for Java

/* Node of a linked list
  class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        Node current =head;
        
        while(current!=null){
            
            if(current.data==key){
                return true;
            }
            current=current.next;
        }
        
        return false;
    }
}
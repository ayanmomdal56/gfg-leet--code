//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


// } Driver Code Ends

// User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    static Node segregate(Node head) {
        if (head == null || head.next == null) return head;

        Node zeroHead= new Node(-1), zeroTail = zeroHead;
        Node oneHead= new Node(-1), oneTail = oneHead;
        Node twoHead= new Node(-1), twoTail = twoHead;

        Node cur=head;
        while (cur!=null) {
            if (cur.data== 0) {
                zeroTail.next= cur;
                zeroTail =zeroTail.next;
            } else if (cur.data== 1) {
                oneTail.next=cur;
                oneTail=oneTail.next;
            } else {
                twoTail.next=cur;
                twoTail=twoTail.next;
            }
            cur=cur.next;
        }

        zeroTail.next=(oneHead.next != null) ? oneHead.next : twoHead.next;
        oneTail.next=twoHead.next;
        twoTail.next=null;

        return zeroHead.next;
    }
}




//{ Driver Code Starts.

class GFG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }

            Node head = null;
            if (!arr.isEmpty()) {
                head = new Node(arr.get(0));
                Node tail = head;
                for (int i = 1; i < arr.size(); i++) {
                    tail.next = new Node(arr.get(i));
                    tail = tail.next;
                }
            }
            head = new Solution().segregate(head);
            printList(head);
        }
    }
}
// } Driver Code Ends
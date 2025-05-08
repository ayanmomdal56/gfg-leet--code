//{ Driver Code Starts
// Initial template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String temp[] = sc.nextLine().trim().split(" ");
            Stack<Integer> myStack = new Stack<>();
            int n = temp.length;
            // adding elements to the stack
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(temp[i]);
                myStack.push(x);
            }
            Solution obj = new Solution();
            obj.deleteMid(myStack);

            while (!myStack.isEmpty()) {
                System.out.print(myStack.peek() + " ");
                myStack.pop();
            }
            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        
     int size = s.size();
        if (size<=1)
        return;
        
        int mid= size/2;
        Stack<Integer> temp = new Stack<>();
        
        for(int i=0;i<mid;i++){
            temp.push(s.pop());
            
        }
        s.pop();
        
                while (!temp.isEmpty()){
                s.push(temp.pop());
                }
}
    
}
       
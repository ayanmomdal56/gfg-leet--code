//{ Driver Code Starts
import java.io.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {
    // Function to check if we can reach the last index from the 0th index.
    public boolean canReach(int[] arr) {
        // code here
        int n=arr.length;
        int maxR=0;

        for (int i=0;i<n;i++) {
            if (i>maxR) {
                return false;
            }
            
 if (i+arr[i]>maxR) {
                maxR=i+arr[i];      
}
}
return true;
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine()); // Number of test cases
        while (t-- > 0) {
            String[] input = br.readLine().split(" ");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }
            Solution ob = new Solution();
            boolean ans = ob.canReach(arr);

            if (ans) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            System.out.println("~");
        }
    }
}
// } Driver Code Ends
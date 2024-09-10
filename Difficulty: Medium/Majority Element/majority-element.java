//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().majorityElement(arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int majorityElement(int arr[]) {
        int cnt = 0;
        int el=arr[0] ;
        for (int i = 0;i<arr.length;i++) {
            if (arr[i]==el) {
                cnt++;
            } else {
                cnt--;
            }
            if (cnt==0) {
                el=arr[i];
                cnt=1;
            }
        }
        int count=0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i]==el) {
                count++;
            }
        }
        if (count>(arr.length/2)) {
            return el;
        }
        return -1;
    }
}

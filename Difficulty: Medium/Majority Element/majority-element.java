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


class Solution {
    static int majorityElement(int arr[]) {
        int c = 0;
        int ele = -1; 
        
        for (int i = 0; i < arr.length; i++) {
            if (c == 0) {
                ele = arr[i]; 
                c = 1;          
            } else if (arr[i] == ele) {
                c++; 
            } else {
                c--; 
            }
        }
        int cnt1 = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == ele) {
                cnt1++;  
            }
        }


        if (cnt1 > (arr.length / 2)) {
            return ele;
        }
        
        
        return -1;
    }
}

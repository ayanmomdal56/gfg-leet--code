// User function Template for Java

class Solution {
    public static String reverseString(String s) {
// int s=arr.length;

String a="";
for(int i=s.length()-1;i>=0;i--){
    a+=s.charAt(i);
    
}

return a;


    }
}
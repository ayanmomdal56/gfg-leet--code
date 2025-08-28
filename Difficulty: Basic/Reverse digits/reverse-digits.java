// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
   int last  = 0;
    int reverse = 0;
    while(n!= 0){
        last = n%10;
        reverse = reverse*10+last;
        n = n/10;
    }
        return reverse;
    }
}
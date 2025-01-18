class Solution {
    public int missingNumber(int[] arr) {
     int   n=arr.length;
           int s2 = (n *(n+1))/2;
int s1=0;

for( int i=0;i<n;i++){
s1+=arr[i];
}

      return s2-s1; 
    }
}
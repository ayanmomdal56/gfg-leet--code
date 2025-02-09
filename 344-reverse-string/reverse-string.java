class Solution {
    public void reverseString(char[] s) {
      int right=0;
       int left=s.length-1;
       while(right<left){
        char temp=s[left];
        s[left]=s[right];
         s[right]=temp;

right++;
left--;
       }
    

    }
}

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        int d=0;
        int temp=x;

        while (temp!=0) {
            d = (d*10)+(temp%10);
            temp = temp / 10;
        }

        return d == x;
    }
}

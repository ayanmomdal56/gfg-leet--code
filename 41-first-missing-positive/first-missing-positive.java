class Solution {
    public int firstMissingPositive(int[] nums) {
 Arrays.sort(nums);
   int s= 1;
        for (int num : nums) { 
            if (num==s) {
            s++; 
            }
        }

        return s;
    }
}
        
       

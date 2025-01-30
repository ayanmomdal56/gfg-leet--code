class Solution {
    public int singleNumber(int[] nums) {
        int f=0;
         for(int i=0;i<nums.length;i++)
         {
            f=f^nums[i];
            
         }
         return f;
    }
    }

class Solution {
    public boolean canJump(int[] nums) {
     int s=0;
        for(int i=0;i<nums.length;i++){
            if(i>s){
                return false;
            }
            s=Math.max(s,i+nums[i]);
        }
        return true;

    }
}
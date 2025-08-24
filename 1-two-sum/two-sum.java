class Solution {
    public int[] twoSum(int[] nums, int target) {
        

int r=0;
for(int i=1;i<nums.length;i++){
   int sum=nums[i]+nums[r];
if(sum==target){
 return new int[] {r,i};
}
if(i==nums.length-1){
r++;
i=r;
}
    

}
return new int[] {};

    }
}
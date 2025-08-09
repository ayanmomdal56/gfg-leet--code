class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int n=nums.length;
int r=0;
int z=0;
int l=0;
int maxlen=0;
    // while (r<n){

// for(int r=0;r<n;r++){
// 
 while (r<n){
if(nums[r]==0){
    z++;
}
while(z>k){
    if(nums[l]==0){
        z--;
    }
    l++;


}
    maxlen=Math.max(maxlen,r-l+ 1);
    r++;
        }
        
        return maxlen;

}
}
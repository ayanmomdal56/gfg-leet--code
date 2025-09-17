class Solution {
    public int[] rearrangeArray(int[] nums) {

int n1=nums.length;
int[] ans= new int[n1];

int pos=0;
int neg=1;

for(int n : nums){
    if(n>0){
        ans[pos]=n;
        pos+=2;
    }
    else{
        ans[neg]=n;
        neg+=2;

    }


}
 return ans;

        
    }
}
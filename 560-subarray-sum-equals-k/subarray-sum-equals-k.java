class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int n = nums.length;


        for (int l = 0; l < n; l++) {
            int sum = 0;
            for (int r = l; r < n; r++) {
                sum += nums[r];
                if (sum == k) {
                    count++;
                    }
    }
}
return count;
}

}
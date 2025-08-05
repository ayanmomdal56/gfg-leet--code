class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findBound(nums, target, true);
        int last = findBound(nums, target, false);
        return new int[] {first, last};
    }

    private int findBound(int[] nums, int target, boolean isFirst) {
        int start = 0, end = nums.length - 1;
        int bound = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                bound = mid;
                if (isFirst) {
                    end = mid - 1; // Search left half
                } else {
                    start = mid + 1; // Search right half
                }
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return bound;
    }
}

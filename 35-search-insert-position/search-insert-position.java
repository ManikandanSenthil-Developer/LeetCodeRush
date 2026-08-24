class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            // If we find the target, or encounter a number greater than the target,
            // this is the correct index for the target.
            if (nums[i] >= target) {
                return i;
            }
        }
        // If the target is larger than all elements in nums, it belongs at the end.
        return nums.length;
    }
}
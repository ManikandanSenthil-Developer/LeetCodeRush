
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> hs = new HashMap<>();
        long sum = 0;
        long maxNum = 0;
        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            hs.put(nums[i],
                hs.getOrDefault(nums[i], 0) + 1);
            if (i - l + 1 > k) {
                sum -= nums[l];
                hs.put(nums[l], hs.get(nums[l]) - 1);
                if (hs.get(nums[l]) == 0) {
                    hs.remove(nums[l]);
                }
                l++;
            }
            if (i - l + 1 == k && hs.size() == k) {
                maxNum = Math.max(maxNum, sum);
            }
        }
        return maxNum;
    }
}

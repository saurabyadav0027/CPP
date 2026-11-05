class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int tsum = 0;

        for(int i = 0; i < n; i++) {
            tsum += nums[i];
        }

        int ans[] = new int[n];

        int left = 0;
        for(int i = 0; i < n; i++) {
            int right = tsum - left - nums[i];
            right = Math.abs(right-left);
            ans[i] = right;
            left += nums[i];
        }

        return ans;
    }
}
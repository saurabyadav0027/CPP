class Solution {
    public int climbStairs(int n) {
        int[] prefix = new int[n + 2]; 
        prefix[0] = 0;
        prefix[1] = 1;

        for (int i = 2; i <= n + 1; i++) {
            prefix[i] = prefix[i - 1] + prefix[i - 2];
        }

        return prefix[n + 1];
    }
}
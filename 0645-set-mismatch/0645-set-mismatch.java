class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int[] fr = new int[nums.length + 1];
        for(int i = 0 ; i < nums.length ; i++) fr[nums[i]]++;
        for(int i = 1 ; i < fr.length ; i++){
            if(fr[i] > 1) ans[0] = i;
            if(fr[i] == 0) ans[1] = i;
        }
        return ans;
    }
}
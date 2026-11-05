class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] a = {-1,-1};
        a[0] = bs(nums,target,true);
        a[1] = bs(nums,target,false);
        return a;
    }
    static int bs(int[] nums , int target , boolean b){
        int s = 0;
        int e = nums.length - 1;
        int bound = -1;
        while(s <= e){
            int m = s + (e-s)/2;
            if(target > nums[m]) s = m + 1;
            else if(target < nums[m]) e = m - 1;
            else {
                bound = m;
                if(b) {
                    e = m-1;
                }
                else {
                    s = m+1;
                }
            }
        }
        return bound;
    }
}
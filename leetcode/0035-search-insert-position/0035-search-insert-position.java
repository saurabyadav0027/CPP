class Solution {
    public int searchInsert(int[] nums, int target) {
        return findtarget(nums,target);
    }
    static int findtarget(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2; 
            
            if (arr[mid] == target)
                return mid;
            if (arr[mid] > target) {
                e = mid - 1; 
            } else {
                s = mid + 1;
            }
        }
        return s;
    }
}
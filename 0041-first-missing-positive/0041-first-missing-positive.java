class Solution {
    public int firstMissingPositive(int[] nums) {
        cyclic(nums);
        for(int i = 1 ; i <= nums.length ; i++){
            if(nums[i-1] != i) return i;
        }
        return nums.length + 1;
    }
    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int crrt = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[crrt] ) {
                swap(arr, i, crrt);
            } else {
                i++;
            }
        }
        
    }
    
    static void swap(int[] arr, int s, int l) {
        int temp = arr[l];
        arr[l] = arr[s];
        arr[s] = temp;
    }
}
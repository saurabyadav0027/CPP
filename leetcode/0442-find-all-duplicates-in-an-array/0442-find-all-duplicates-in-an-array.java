class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        cyclic(nums);
        for (int i = 0; i < nums.length; i++) if (nums[i] != i + 1) ans.add(nums[i]);
        return ans;

    }
    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            
            int correctPos = arr[i] - 1;
            
            
            if (arr[i] != arr[correctPos]) {
                swap(arr, i, correctPos);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}
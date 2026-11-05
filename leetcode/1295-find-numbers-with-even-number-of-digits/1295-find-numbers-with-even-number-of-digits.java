class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            int digi = 0;
            
            while(nums[i] > 0){
                nums[i]/=10;
                digi++;
            }
            if(digi % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
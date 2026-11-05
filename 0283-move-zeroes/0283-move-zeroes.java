class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                a.add(nums[i]);
            }
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(i < a.size()){
                nums[i] = a.get(i);
            }
            else{
                nums[i] = 0;
            }
        }
        
        
    }
}
class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> a = new ArrayList<>();
        int k = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != val){
                k++;
                a.add(nums[i]);
            }
        }
        for(int i = 0 ; i < a.size() ; i++){
            nums[i] = a.get(i);
        }
        return k;
        
    }
}
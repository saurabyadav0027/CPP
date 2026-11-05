
class Solution {
    public int thirdMax(int[] nums) {
        int f = Integer.MIN_VALUE, s = Integer.MIN_VALUE, t = Integer.MIN_VALUE;
        int[] un = Arrays.stream(nums).distinct().toArray(); 
        int count = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == f || nums[i] == s || nums[i] == t){
                continue;
            }
            if(nums[i] > f){
                t = s;
                s = f;
                f = nums[i];
            }
            if(nums[i] > s && nums[i] < f){
                t = s;
                s = nums[i];
            }
            if(nums[i] > t && nums[i] < s){
                t = nums[i];
                count++;
            }
        }
        //if (count == 0) {
        //    return f;
        //}else{
        //    return t;
        //}
        if(un.length < 3) return f;
        return t;
    }
}
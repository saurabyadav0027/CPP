class NumArray {
    ArrayList<Integer> arr = new ArrayList<>();
    public NumArray(int[] nums) {
        for(int num : nums) arr.add(num);
    }
    
    public int sumRange(int left, int right) {
        int[] p = new int[arr.size()];
        p[0] = arr.get(0);
        for(int i = 1 ; i < arr.size() ; i++){
            p[i] = p[i-1] + arr.get(i);
        }

        if(left == 0) return p[right];
        return p[right] - p[left - 1];
        
 
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
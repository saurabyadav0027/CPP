class Solution {
    public int maxArea(int[] a) {
        int maxcap = 0 ;
        int right  = (a.length - 1)  , left = 0 ;
        while(left < right){
            int currentlength =  Math.min(a[left] , a[right]);
            int b = right - left;
            int currentarea = currentlength*b;
            maxcap = Math.max(currentarea,maxcap);

            if(a[left] < a[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxcap;
    }
}
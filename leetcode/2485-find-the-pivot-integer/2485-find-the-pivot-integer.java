class Solution {
    public int pivotInteger(int n) {
        int ans = 0;
        for(int i = 1 ; i <=n ; i++){
            int ttl = n*(n+1)/2;
            ttl -= ans;
            ans += i;
            if(ans == ttl){
                return i;
            }
        }
        return -1;
        
    }
}
class Solution {
public:
    int maxArea(vector<int>& a) {
        int maxcap = 0;
        int r = a.size() - 1;
        int l = 0;

        while(l < r){
            int currLen = min(a[l], a[r]);
            int bre = r - l;
            int curr = currLen* bre;
            maxcap = max(curr,maxcap);
            if(a[l] < a[r]) l++;
            else r--;
        }
        return maxcap;
    }
};
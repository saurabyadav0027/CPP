class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int maxP = 0;
        int minP = INT_MAX;

        for(int i = 0; i < prices.size(); i++){
            minP = min(minP, prices[i]);
            int pro = prices[i] - minP;
            maxP = max(maxP, pro);
        }

        return maxP;

    }
};
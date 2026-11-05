class Solution {
public:
    int longestConsecutive(vector<int>& nums) {

        unordered_set<int> st;

        for (int x : nums) {
            st.insert(x);
        }

        int maxCount = 0;

        for (int num : st) {

            if (st.count(num - 1) == 0) {

                int curr = num;
                int count = 1;

                while (st.count(curr + 1)) {
                    curr++;
                    count++;
                }

                maxCount = max(maxCount, count);
            }
        }

        return maxCount;
    }
};
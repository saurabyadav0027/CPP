class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.size() != s.size()) return false;
        vector<int> arrs(26);
        vector<int> arrt(26);
  

        for(int i = 0; i < s.size(); i++){
            arrs[s[i] - 'a']++;
        }for(int i = 0; i < t.size(); i++){
            arrt[t[i] - 'a']++;
        }

        if(arrs == arrt) return true;
        return false;
    }
};
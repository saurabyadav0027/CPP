class Solution {
public:
    bool isPalindrome(string s) {
        string str;
        for(char ch : s){
            if(isalnum(ch)){
                str += tolower(ch);
            }
        }

        int l = 0;
        int r = str.size() - 1;

        while(l <= r){
            if(str[l] != str[r]) return false;
            else{
                l++;
                r--;
            }
        }
        return true;
    }
};
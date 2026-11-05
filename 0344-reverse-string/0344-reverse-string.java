class Solution {
    public void reverseString(char[] s) {
        StringBuilder copy = new StringBuilder();

        for(int i = 0 ; i < s.length ; i++){
            copy.append(s[s.length - i - 1]);
        }
        for(int i = 0 ; i < s.length ; i++){
            s[i] = copy.charAt(i);
        }
    }
}
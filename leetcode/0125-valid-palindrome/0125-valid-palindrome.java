class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char a = Character.toLowerCase(s.charAt(i));
            if (Character.isLetterOrDigit(a)) {
                r.append(a);
            }
        }
        int i = 0 , j = r.length() - 1 ;
        while(i < j){
            if(r.charAt(i) != r.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
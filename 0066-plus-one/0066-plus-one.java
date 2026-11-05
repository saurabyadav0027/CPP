import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] num) {
        StringBuilder sb = new StringBuilder();
        for (int n : num) {
            sb.append(n);
        }

        BigInteger sum = new BigInteger(sb.toString());
        sum = sum.add(BigInteger.ONE);

        String resultStr = sum.toString();
        int[] ans = new int[resultStr.length()];

        for (int i = 0; i < resultStr.length(); i++) {
            ans[i] = Character.getNumericValue(resultStr.charAt(i));
        }

        return ans;
    }
}
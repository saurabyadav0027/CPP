import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger numa = new BigInteger(a, 2);
        BigInteger numb = new BigInteger(b, 2);
        BigInteger sum = numa.add(numb);
        return sum.toString(2);
    }
}
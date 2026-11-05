class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftSum = 0;
        for (int i = 0; i < k; i++) {
            leftSum += cardPoints[i];
        }

        int max = leftSum;
        int rightSum = 0;
        int rightIndex = cardPoints.length - 1;

        for (int i = k - 1; i >= 0; i--) {
            leftSum -= cardPoints[i];
            rightSum += cardPoints[rightIndex];
            rightIndex--;
            
            max = Math.max(max, leftSum + rightSum);
        }

        return max;
    }
}
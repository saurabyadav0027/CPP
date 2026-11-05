
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] a = new int[nums1.length + nums2.length];
        double ans = 0;
        for (int i = 0; i < nums1.length + nums2.length; i++) {
            if (i < nums1.length) {
                a[i] = nums1[i];
            }
            else {
                a[i] = nums2[i-nums1.length];
            }
        }
        Arrays.sort(a);
        int k = a.length;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        if (a.length % 2 == 1) {
            ans = a[((k + 1) / 2) - 1];
        }
        else {
            ans = (a[(k / 2) - 1] + a[(k / 2)]) / 2.0;
        }
        return ans;
    }
}
import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for(int j = 0 ; j < nums2.length ; j++){
                if(nums1[i] == nums2[j]){
                    ans.add(nums1[i]);
                }
            }
        }
        List<Integer> unique = ans.stream()
                                      .distinct()
                                      .collect(Collectors.toList());
        int[] an = new int[unique.size()];
        for(int i =0 ; i<unique.size();i++){
            an[i] = unique.get(i);
        }

        return an;

    }
}
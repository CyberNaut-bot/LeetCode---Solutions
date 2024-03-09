using System.Collections.Generic;
public class Solution {
    public int GetCommon(int[] nums1, int[] nums2) {
        HashSet<int> numSet = new HashSet<int>(nums1);
        foreach (int num in nums2) {
            if (numSet.Contains(num)) {
                return num;
            }
        }
        return -1;
    }
}
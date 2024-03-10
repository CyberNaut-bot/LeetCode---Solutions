class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
         HashSet<Integer> set3 = new HashSet<Integer>();
        for(Integer i:nums1)
        {
            set1.add(i);
        }
        for(Integer j:nums2)
        {
            set2.add(j);
        }
        for(Integer x:set1)
        {
            if(set2.contains(x))
            {
                set3.add(x);
            }
        }
        int[] result = new int[set3.size()];
        int index = 0;
        for(Integer num:set3)
        {
            result[index++] = num;
        }
        return result;
    }
}
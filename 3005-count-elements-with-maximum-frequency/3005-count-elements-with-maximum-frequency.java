class Solution {
    public int maxFrequencyElements(int[] nums) {
       int maxi = Integer.MIN_VALUE;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int count = 0;
        for(int i:nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int j:hm.values())
        {
           maxi = Math.max(j,maxi);
        }
        for (int freq : hm.values()) {
            if (freq == maxi)
                count += maxi;
        }
        return count;
    }
}
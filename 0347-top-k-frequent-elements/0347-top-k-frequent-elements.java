class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
         PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> hm.get(b)-hm.get(a));
        pq.addAll(hm.keySet());
        
        int[] ans = new int[k];
        for(int i=0; i<k ; i++){
            ans[i] = pq.poll();
        }
        return ans;
        
    }
}
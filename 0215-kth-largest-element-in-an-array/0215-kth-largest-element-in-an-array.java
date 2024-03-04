import java.util.Comparator;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i:nums)
        {
            pq.add(i);
        }
        int f = k-1;
        while(f>0)
        {
            pq.remove();
            f--;
        }
        return pq.peek();
        
    }
}
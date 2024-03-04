class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        
       PriorityQueue<String> pq=new PriorityQueue<>((a,b)->{
          if(a.length()==b.length())return b.compareTo(a);
          else if(a.length()<b.length())return 1;
          else return -1;
        });
        for(String i:nums)pq.add(i);
        while(k--!=1)pq.poll();
        return pq.peek();
        
    }
}
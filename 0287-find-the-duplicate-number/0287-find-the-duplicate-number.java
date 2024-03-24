class Solution {
    public int findDuplicate(int[] nums) {
         HashMap<Integer,Integer> hm = new HashMap<>();
        int count = 0;
        int result = 0;
      for(Integer x : nums)
       {
           if(hm.containsKey(x))
           {
             return x;
           }
           else
           {
               hm.put(x,1);
           }
       }
       return -1;
    }
}
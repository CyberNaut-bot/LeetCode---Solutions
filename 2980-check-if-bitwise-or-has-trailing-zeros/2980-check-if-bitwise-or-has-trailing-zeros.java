class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int count = 0;
         if (nums == null || nums.length < 2) 
         {
            return false; 
         }
        for(int i =0;i<nums.length;i++)
         {
            for(int j = i+1;j<nums.length;j++)
        {
               int number = nums[i];
                int number1 = nums[j];
                
                
                int bitwiseOR = number | number1;

               
                if ((bitwiseOR & 1) == 0) {
                    count++;
                }
            }
        }

        return count > 0;
        
    }
}
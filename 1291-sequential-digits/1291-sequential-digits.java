class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();
        int num = 0;
        int nextDigit = 0;
        for(int i=1;i<=9;i++)
        {
            num = i;
            nextDigit = i+1;
            while(num<=high && nextDigit<=9)
            {
                num = num * 10 + nextDigit;
                if (low <= num && num <= high) 
                    res.add(num);
                ++nextDigit;
            }
           
           
            
        }
         res.sort(null);
         return res;
    }
}
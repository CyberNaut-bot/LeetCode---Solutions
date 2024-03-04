class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int result = 0;
        int score = 0;
        Arrays.sort(tokens);
        int left = 0;
        int right = tokens.length-1;
        while(left<=right)
        {
            if(power>=tokens[left])
            {
                power = power - tokens[left];
                score = score + 1;
                left++;
                result = Math.max(result,score);
            }
            else if(score>0)
            {
                power = power + tokens[right];
                score = score - 1;
                right--;
            }
            else
                break;
        }
        return result;
    }
}
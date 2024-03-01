class Solution {
    public boolean isPerfectSquare(int num) {
        double perf = Math.sqrt(num);
        if(perf == Math.floor(perf))
           return true;
        else
            return false;
    }
}
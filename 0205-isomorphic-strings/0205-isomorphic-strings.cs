public class Solution {
    public bool IsIsomorphic(string s, string t) {
        int[] map1 = new int[256];
        int[] map2 = new int[256];
        if(s.Length!=t.Length)
            return false;
        for(int i=0;i<s.Length;i++)
        {
            if(map1[s[i]]!=map2[t[i]])
                return false;
            
            map1[s[i]]=i+1;
            map2[t[i]]=i+1;
        }
        return true;
    }
}
class Solution {
    public String minWindow(String s, String t) {
         if (s.equals(t)) {
            return t;
        }

        int sLen = s.length();
        int tlen = t.length();
        if (sLen < tlen) {
            return "";
        }

        int minLen = Integer.MAX_VALUE;
        int ansLeft = -1;
        int ansRight = -1;

        Map<Character, Integer> wMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (char ch : t.toCharArray()) {
            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int right = -1;
        while (right < sLen) {
            right++;
            if (right < sLen && tMap.containsKey(s.charAt(right))) {
                wMap.put(s.charAt(right), wMap.getOrDefault(s.charAt(right), 0) + 1);
            }

            while (check(wMap, tMap) && left <= right) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    ansLeft = left;
                    ansRight = left + minLen;
                }

                if (tMap.containsKey(s.charAt(left))) {
                    wMap.put(s.charAt(left), wMap.getOrDefault(s.charAt(left), 0) - 1);
                }

                left++;
            }
        }

        return ansLeft == -1 ? "" : s.substring(ansLeft, ansRight);
    }

    public boolean check(Map<Character, Integer> mapA, Map<Character, Integer> mapB) {
        for (Map.Entry<Character, Integer> entry : mapB.entrySet()) {
            Character ch = entry.getKey();
            int cnt = entry.getValue();

            if (mapA.getOrDefault(ch, 0) < cnt) {
                return false;
            }
        }

        return true;
    }
}
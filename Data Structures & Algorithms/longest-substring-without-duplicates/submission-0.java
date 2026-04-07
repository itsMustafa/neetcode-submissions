class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] sChars = s.toCharArray();
        int left = 0;
        int res = 0;
        Map<Character, Integer> charToIdxMap = new HashMap<>();

        for(int right = 0; right < sChars.length; right++) {
            if (charToIdxMap.containsKey(sChars[right])) {
                left = Math.max(charToIdxMap.get(sChars[right]) + 1, left);
            }

            charToIdxMap.put(sChars[right], right);
            res = Math.max(right - left + 1, res);
        }

        return res;
    }
}

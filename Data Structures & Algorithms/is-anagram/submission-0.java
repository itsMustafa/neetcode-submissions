class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        HashMap<Character, Integer> sFrequency = new HashMap<>();
        HashMap<Character, Integer> tFrequency = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            sFrequency.put(sChars[i], sFrequency.getOrDefault(sChars[i], 0) + 1);
            tFrequency.put(tChars[i], tFrequency.getOrDefault(tChars[i], 0) + 1);
        }

        return sFrequency.equals(tFrequency);
    }
}

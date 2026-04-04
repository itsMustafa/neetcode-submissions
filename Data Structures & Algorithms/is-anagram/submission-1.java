class Solution {
    public boolean isAnagram(String s, String t) {
        // if length of both string does not matches
        // its not anagram, no need to check the content
        if (s.length() != t.length()) {
            return false;
        }

        // convert to char arrays for better readability
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        // create the hashmap to hash the char and frequence
        HashMap<Character, Integer> sFrequency = new HashMap<>();
        HashMap<Character, Integer> tFrequency = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            sFrequency.put(sChars[i], sFrequency.getOrDefault(sChars[i], 0) + 1);
            tFrequency.put(tChars[i], tFrequency.getOrDefault(tChars[i], 0) + 1);
        }

        // if the char frequency hash are equals Strings ara anagrams
        return sFrequency.equals(tFrequency);
    }
}

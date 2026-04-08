class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        
        for (String str: strs) {
            // create an array with char count which will act as a key to the map to hold anagrams 
            int[] count = new int[26];
            
            for (char ch: str.toCharArray()) {
                count[ch - 'a']++;
            }
            
            // convert array to String to use as a key in map
            String key = Arrays.toString(count);
            // initialize the map with the key and empty arraylist to hold anagrams
            res.putIfAbsent(key, new ArrayList<>());
            // for the particular key(char frequencies) update the list with matchin key(anagrams)
            res.get(key).add(str);
        }
        return new ArrayList<>(res.values());
    }
}

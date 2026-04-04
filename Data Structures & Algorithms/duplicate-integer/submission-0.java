class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        for(int num: nums) {
            if (counter.containsKey(num)) {
                return true;
            }
            counter.put(num, 1);
        }
        return false;
    }
}
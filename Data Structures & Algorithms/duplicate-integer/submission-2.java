class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Use a set to hash visited elements
        Set<Integer> uniqueElements = new HashSet<>();
        for(int num: nums) {
            // if the hash contains visited element then array has duplicates
            if (uniqueElements.contains(num)) {
                return true;
            }
            uniqueElements.add(num);
        }

        // if no duplicates found in the hash then array does not have duplicates
        return false;
    }
}
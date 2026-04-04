class Solution {
    public int[] twoSum(int[] nums, int target) {
        // create a hash for value to index
        HashMap<Integer, Integer> valToIdx = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            // calculate the difference on every index
            int difference = target - nums[i];

            // if the difference found in the previous hash of values
            if (valToIdx.containsKey(difference)) {
                // return its index and current index as res
                return new int[] { valToIdx.get(difference), i };
            }

            valToIdx.put(nums[i], i);
        }

        // if not found then return empty array as default res
        return new int[] {};
    }
}

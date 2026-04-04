class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> valToIdx = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];

            if (valToIdx.containsKey(difference)) {
                return new int[] { valToIdx.get(difference), i };
            }

            valToIdx.put(nums[i], i);
        }

        return new int[] {};
    }
}

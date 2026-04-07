class Solution {
    public int pivotIndex(int[] nums) {
        // pivot index = leftSum == rightSum
        
        int totalSum = 0, leftSum = 0;

        for(int num: nums) {
            totalSum += num;
        }

        for(int i = 0; i < nums.length; i++) {
            // rightSum = total - left - curretnElement
            int rightSum = totalSum - leftSum - nums[i];
            
            if(leftSum == rightSum) {
                return i;
            }

            // calculate leftSum
            leftSum += nums[i];
        }

        // default value
        return -1;
        
    }
}
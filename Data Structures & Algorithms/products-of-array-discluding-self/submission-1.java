class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        // create a result array
        int[] res = new int[n];

        // initialize start of res index with value 1
        res[0] = 1;
        for (int i = 1; i < n; i ++) {
            // res[1] = res[0](1) * nums[0](first element of given array)
            // res[i] = previous value * element from num array
            // update next array index with product of past elements
            res[i] = res[i - 1] * nums[i - 1];
        }

        // initialize postfix as 1;
        int postfix = 1;

        // start loop in reverse
        for (int i = n - 1; i >= 0; i--) {
            // res[last] = last element * postfix(1)
            // postfix is updated with product of current element with last product
            res[i] = res[i] * postfix;
            postfix = postfix * nums[i];
        }

        // resulting array is the product of prefix and postfix excluding self
        return res;
    }
}  

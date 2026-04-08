class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxWater = 0;

        while(left < right) {
            // max height of container should be min of both heights as
            // if height of 1 side is bigger than other, the water will overflow
            // and fall from the least height side
            int maxHeightOfContainer = Math.min(heights[left], heights[right]);
            
            int waterArea = (right - left) * maxHeightOfContainer;
            
            maxWater = Math.max(maxWater, waterArea);
            
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}

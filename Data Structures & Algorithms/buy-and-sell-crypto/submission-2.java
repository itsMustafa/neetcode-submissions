class Solution {
    public int maxProfit(int[] prices) {
        // init profit 0 and buyPrice to first price
        int profit = 0;
        int buyPrice = prices[0];

        for(int i = 1; i < prices.length; i++) {
            // if the new price is less than our buyPrice, update buyPrice
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            }
            // profit will always be max of current recorded profit and
            // new profit i.e. sellPrice - buyPrice
            profit = Math.max(profit, prices[i] - buyPrice);
        }

        return profit;
        
    }
}

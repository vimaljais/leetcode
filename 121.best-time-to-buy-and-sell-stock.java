/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int p1 = 0;
        int p2 = 1;

        int maxProfit = 0;

        while(p2<prices.length) {
            int diff = prices[p2] - prices[p1];
            if((prices[p2] - prices[p1]) >= 0) {
                p2++;
            }
            else {
                p1=p2;
                p2++;

            }
            if((prices[p2] - prices[p1])> maxProfit) {
                maxProfit = (prices[p2] - prices[p1]);
            }
        }
        return maxProfit;
    }
}
// @lc code=end


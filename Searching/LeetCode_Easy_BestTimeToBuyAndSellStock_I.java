import java.util.*;
// Problem - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Explanation - https://www.youtube.com/watch?v=34WE6kwq49U
// Go through video to analyze brute force approach, then more optimized approach and the most optimal approach.

// Brute Force (2 nested loops) ->      T.C = O(n^2)      S.C = O(1)

// More optimized (Using an auxiliary array to store maximum prices from right to left index) ->      T.C = O(n)      S.C = O(n)

// Most Optimal Approach (We'll try to sell our stocks each day, and will check what was the min price so far before this,
// e.g. 3,1,4,8,7,2,5 -> on reaching 7, we analyze that 1 was the minimum price so far, so 7-1 = 6) ->      T.C = O(n)      S.C = O(1)

class LeetCode_Easy_BestTimeToBuyAndSellStock_I {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int minSoFar = prices[0];   // Minimum price of stock so far
        int maximumProfit = 0;

        for(int i=0; i<n; i++){
            minSoFar = Math.min(minSoFar, prices[i]);
            int profit = prices[i] - minSoFar;
            maximumProfit = Math.max(maximumProfit, profit);
        }
        return maximumProfit;
    }
    public static void main(String[] args){
        int[] prices = {-39957, -17136, 35466, 21820, -26711};

        int ans = maxProfit(prices);
        System.out.println(ans);

    }
}
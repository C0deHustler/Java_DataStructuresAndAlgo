// Problem - https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
// Explanation - https://www.youtube.com/watch?v=Q7v239y-Tik
// We have to find the maximum profit and, also we can buy and share stocks any number of times.
public class LeetCode_Easy_BestTimeToBuyAndSellStock_II {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        for(int i=1; i<n; i++){
            if(prices[i] > prices[i-1]){
                profit += prices[i]-prices[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args){
        int[] prices = {-39957, -17136, 35466, 21820, -26711};

        int ans = maxProfit(prices);
        System.out.println(ans);
    }
}
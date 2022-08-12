import java.util.*;
import java.io.*;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/5/searching/codingAssignment/MAXPRO
// Explanation - https://www.youtube.com/watch?v=Q7v239y-Tik
public class Prepbytes_Medium_StockMarket {
    public static long maxProfit(int[] prices) {
        int n = prices.length;
        long profit = 0;
        for(int i=1; i<n; i++){
            if(prices[i] > prices[i-1]){
                profit += prices[i]-prices[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            long ans = maxProfit(arr);
            System.out.println(ans);
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/8/stacks/video/af14098cddb849deadc93c5399142701
// Explanation video - https://www.youtube.com/watch?v=-IFmgue8sF0
// Explanation code - https://www.geeksforgeeks.org/the-stock-span-problem/
// S.C - O(n)
// T.C - O(n)
public class Prepbytes_StockSpanProblem_OptimalApproach {
    public static void calculateSpan(int[] price, int n, int[] span){
        Stack<Integer> st = new Stack<>();
        st.push(0);

        span[0] = 1;

        for (int i = 1; i < n; i++) {
            while (!(st.empty()) && (price[st.peek()] <= price[i])) {
                st.pop();
            }
            if(st.empty()){
                span[i] = i+1;
            }
            else{
                span[i] = i - st.peek();
            }
            st.push(i);
        }
    }
    public static void print(int[] arr){
        System.out.print(Arrays.toString(arr)+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] price = new int[n];
            for (int i = 0; i < n; i++) {
                price[i] = sc.nextInt();
            }

            int[] span = new int[n];

            calculateSpan(price, n, span);
            print(span);
        }
    }
}

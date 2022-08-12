// Problem - https://mycode.prepbytes.com/problems/divide-and-conquer/DIVISIBLE
// Problem - https://leetcode.com/problems/nth-magical-number/ (Leetcode problem has a new way for returning ans using [mod 10^9 + 7], must see it)
// Explanation - Gallery Pics and Prepbytes Video

// T.C - O(log n)

public class Prepbytes_DivisibleNumber_OptimalApproach {
    public static long gcd(long a, long b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }

    public static long solve(long a, long b, long k){
        long ans;
        long low = 0;
        long high = Long.MAX_VALUE;
        long lcm = (a * b)/gcd(a, b);

        while(low < high){
            long mid = low + (high - low)/2;
            ans = (mid / a) + (mid / b) - (mid / lcm);  // this will tell the count of lucky numbers that exists in that range of low and high

            if(ans < k){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        return low ;
    }

    public static void main(String[] args) {
        long a = 2;
        long b = 4;
        long k = 5;

        long ans = solve(a, b, k);
        System.out.println(ans);
        // final ans array -> [2, 3, 4, 6, 8, 9, 10, 12, 14, 15], 15 is the 10th number divisible by either a = 2 or b = 3
    }
}

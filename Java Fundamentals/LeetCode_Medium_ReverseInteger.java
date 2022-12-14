// Problem - https://leetcode.com/problems/reverse-integer/

public class LeetCode_Medium_ReverseInteger {
    class Solution {
        public int reverse(int x) {
            long r = 0;
            while(x != 0){
                r = (r * 10) + (x % 10);
                x = x / 10;
            }

            if(r >= Integer.MIN_VALUE && r <= Integer.MAX_VALUE){
                return (int)r;
            }
            else{
                return 0;
            }
        }
    }
}

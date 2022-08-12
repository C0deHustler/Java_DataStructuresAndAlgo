// Problem - https://leetcode.com/problems/palindromic-substrings/

// Explanation - https://www.youtube.com/watch?v=_jM3iMT4k7g

public class LeetCode_Medium_PalindromicSubstrings {

    public static boolean isPalindrome(String str){
        int low = 0;
        int high = str.length() - 1;

        while(low <= high){
            char ch1 = str.charAt(low);
            char ch2 = str.charAt(high);

            if(ch1 != ch2){
                return false;
            }
            else{
                low++;
                high--;
            }
        }
        return true;
    }

    public static int solve(String s) {
        int count = 0;

        for(int i=0; i<s.length(); i++){

            for(int j=i+1; j<=s.length(); j++){

                String ss = s.substring(i, j);

                if(isPalindrome(ss)){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "abc";

        int ans = solve(str);
        System.out.println(ans);
    }
}

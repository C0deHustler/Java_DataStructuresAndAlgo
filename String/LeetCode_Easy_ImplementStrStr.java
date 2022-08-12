// Problem - https://leetcode.com/problems/implement-strstr/

public class LeetCode_Easy_ImplementStrStr {
    public static int strStr(String haystack, String needle) {
        int l1 = haystack.length();
        int l2 = needle.length();

        if(l2 > l1){
            return -1;
        }
        if(l2 == 0){
            return 0;
        }

        // Important Section
        int threshold = l1 - l2;
        for(int i=0; i<=threshold; i++){
            if(haystack.substring(i, i+l2).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";

        int ans = strStr(haystack, needle) ;
        System.out.println(ans);
    }
}

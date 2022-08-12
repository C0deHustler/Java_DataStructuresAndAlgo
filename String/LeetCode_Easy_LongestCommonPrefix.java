import java.util.*;
// Problem - https://leetcode.com/problems/longest-common-prefix/

public class LeetCode_Easy_LongestCommonPrefix {
    public static String longestCommonPrefix(String[] str) {
        if(str.length == 0 || str == null){
            return "";
        }
        int count = 0;
        Arrays.sort(str);

        String firstStr = str[0];
        String lastStr = str[str.length - 1];

        while(count < firstStr.length()){
            if(firstStr.charAt(count) == lastStr.charAt(count)){
                count++;
            }
            else{
                break;
            }
        }

        return (count == 0) ? "" : firstStr.substring(0, count);
    }

    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};

        String ans = longestCommonPrefix(str);
        System.out.println(ans);
    }
}

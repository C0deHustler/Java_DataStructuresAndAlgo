import java.util.*;
// Problem - https://leetcode.com/problems/word-subsets/
// Explanation - https://www.youtube.com/watch?v=ByQfvU8_fvM

// T.C - O(A + B), where A and B are the respective size of both the arrays
// S.C - O(A.length), as the ans may contain all the string given in String Array A

public class LeetCode_Medium_WordSubsets {

    public static List<String> solve(String[] words1, String[] words2) {
        List<String> result = new ArrayList<>();

        int[] freq2 = new int[26];  // stores the maximum cumulative count of all characters of each string of string array2, see video(2:45, 3:55)
        for(String str2 : words2){
            int[] temp2 = new int[26];  // temp array to store count of characters of str2, e.g. character count for "ee", or "oc", or "ceo"

            for(char ch : str2.toCharArray()){
                temp2[ch - 'a']++;
                freq2[ch - 'a'] = Math.max(freq2[ch - 'a'], temp2[ch - 'a']);   // freq2 will store maximum count for every character present in
                                                                                // each and every string of array words2
            }
        }

        for(String str1 : words1){
            int[] temp1 = new int[26];  // for storing count of character of str1 i.e "leetcode", "amazon", "facebook".

            for(char ch : str1.toCharArray()){
                temp1[ch - 'a']++;  // storing count
            }

            // For easy understanding, consider array words2 as the demanding customer, and array words1 as the available stock at the shop,
            // so for now, freq2 is the demanding customer, and temp1 is the available stock, now see the subset function
            if(subset(freq2, temp1)){
                result.add(str1);
            }
        }
        return result;
    }

    public static boolean subset(int[] demand, int[] stock){
        // Point - 1
        // both arrays are storing the count of each character in them,
        // consider demand[] is storing the number of units of each type of item('a','b','c',... can be considered as items) which we need to buy
        // and stock[] is storing the available units of each item('a','b','c',...)
        // simple logic, if enough stock is present, then only demand of customer will be satisfied
        for(int i=0; i<26; i++){
            if(stock[i] < demand[i]){
                return false;   // false, if stock of any particular item is less than the requirement
            }
        }
        return true;    // else true
    }
    // we can consider "eeco"(when str2[] = {"ee","oc","ceo"}) as the maximum cumulative demand of a customer
    // and "aamnoz"(when "amazon"), or "eeecdlot"(when "leetcode") a the available stock, so for satisfying our subset problem, follow the trick
    // explained above. (Point-1)

    public static void main(String[] args) {
        String[] str1 = {"amazon", "facebook", "leetcode", "apple"};
        String[] str2 = {"ee", "oc", "ceo"};

        List<String> ans = solve(str1, str2);
        System.out.println(ans);

        String[] str3 = {"amazon", "facebook", "leetcode", "apple", "google"};
        String[] str4 = {"ec", "oc", "ceo"};

        List<String> ans2 = solve(str3, str4);
        System.out.println(ans2);
    }
}

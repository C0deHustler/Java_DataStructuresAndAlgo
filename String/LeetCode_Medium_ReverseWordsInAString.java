// Problem - https://leetcode.com/problems/reverse-words-in-a-string/

// Explanation - https://www.youtube.com/watch?v=vhnRAaJybpA

public class LeetCode_Medium_ReverseWordsInAString {
    public static String reverseWords(String s) {
        String ans = "";
        int start = 0;
        int n = s.length();

        while(start < n){
            // start will search for the starting of a word  i.e. first alphabetic character
            while(start < n && s.charAt(start) == ' '){
                start++;
            }
            if(start >= n){
                break;
            }

            // end will search for the ending of a word i.e. first non-alphabetic character
            int end = start + 1;
            while(end < n && s.charAt(end) != ' '){
                end++;
            }

            String word = s.substring(start, end);
            start = end;    // update start once we found a word
            // if founded word is the 1st word of the string
            if(ans.length() == 0){
                ans = word;
            }
            else{
                // Main trick to reverse the words (add them at the end of previously existing "word")
                ans = word + " " + ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "  The sky is   blue  ";   // blue is sky The
        String ans = reverseWords(str);
        System.out.println(ans);
    }
}

// Problem - https://leetcode.com/problems/valid-anagram/

public class LeetCode_Easy_ValidAnagram {
    public static boolean solve(String s, String t) {
        int[] freq = new int[26];

        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }

        for(int i=0; i<t.length(); i++){
            freq[t.charAt(i) - 'a']--;
        }

        for (int j : freq) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean ans = solve(s, t);
        if(ans){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
// Problem - https://leetcode.com/problems/find-and-replace-pattern/
// Explanation - LeetCode_Easy_IsomorphicString.java

public class LeetCode_Medium_FindAndReplacePattern {
    public static boolean isIsomorphic(String s, String t) {
        if(s == null || t == null){
            return false;
        }
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            int indexS = mapS.getOrDefault(s.charAt(i), -1);
            int indexT = mapT.getOrDefault(t.charAt(i), -1);

            if(indexS != indexT){
                return false;
            }

            mapS.put(s.charAt(i), i);
            mapT.put(t.charAt(i), i);
        }

        return  true;
    }

    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();

        for(int i=0; i<words.length; i++){
            if(isIsomorphic(words[i], pattern)){
                ans.add(words[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
        String target = "abb";

        List<String> result = findAndReplacePattern(words, target);
        System.out.println(result);
    }
}

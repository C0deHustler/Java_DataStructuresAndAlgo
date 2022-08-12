// Problem - https://leetcode.com/problems/isomorphic-strings/

public class LeetCode_Easy_IsomorphicString {
//    class Solution {
//        public boolean isIsomorphic(String s, String t) {
//            if(s == null || t == null){
//                return false;
//            }
//            if(s.length() != t.length()){
//                return false;
//            }
//
//            HashMap<Character, Integer> mapS = new HashMap<>();
//            HashMap<Character, Integer> mapT = new HashMap<>();
//
//            for(int i=0; i<s.length(); i++){
//                int indexS = mapS.getOrDefault(s.charAt(i), -1);
//                int indexT = mapT.getOrDefault(t.charAt(i), -1);
//
//                if(indexS != indexT){
//                    return false;
//                }
//
//                mapS.put(s.charAt(i), i);
//                mapT.put(t.charAt(i), i);
//            }
//
//            return  true;
//        }
//    }
}

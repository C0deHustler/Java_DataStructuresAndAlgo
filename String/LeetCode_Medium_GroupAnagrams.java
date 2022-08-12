import java.util.*;
// Problem - https://leetcode.com/problems/group-anagrams/
// Explanation - https://www.youtube.com/watch?v=NNBQik4phMI

// See video for easy explanation

public class LeetCode_Medium_GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, ArrayList<String>> bigMap = new HashMap<>();

        for(String str : strs){
            HashMap<Character, Integer> freqMap = new HashMap<>();

            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            }

            if(!bigMap.containsKey(freqMap)){
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                bigMap.put(freqMap, list);
            }
            else{
                ArrayList<String> list = bigMap.get(freqMap);
                list.add(str);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for(List<String> ele : bigMap.values()){
            result.add(ele);
        }

        return result;
    }
    public static void main(String[] args) {
        String[] arr = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> ans = groupAnagrams(arr);
        System.out.println(ans);
    }
}

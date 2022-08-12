import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
// Problem - https://leetcode.com/contest/biweekly-contest-84/problems/merge-similar-items/

public class LeetCode_Contest_Easy_MergeSimilarItems {
    public static List<List<Integer>> solve(int[][] nums1, int[][] nums2){
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for(int i=0; i< nums1.length; i++){
            map1.put(nums1[i][0], nums1[i][1]);
        }
        for(int i=0; i< nums2.length; i++){
            map2.put(nums2[i][0], nums2[i][1]);
        }

        for(int i=1; i<=1000; i++){
            if(map1.isEmpty() && map2.isEmpty()){
                break;
            }
            if(map1.containsKey(i) && map2.containsKey(i)){
                List<Integer> temp1 = new ArrayList<>();
                temp1.add(i);
                temp1.add((map1.get(i) + map2.get(i)));
                if(temp1.get(1) == null){
                    continue;
                }
                result.add(temp1);

                map2.remove(i);
                map1.remove(i);
            }
            else if(map1.containsKey(i)){
                List<Integer> temp2 = new ArrayList<>();
                temp2.add(i);
                temp2.add((map1.get(i)));
                if(temp2.get(1) == null){
                    continue;
                }

                result.add(temp2);

                map1.remove(i);
            }
            else{
                List<Integer> temp3 = new ArrayList<>();
                temp3.add(i);
                temp3.add((map2.get(i)));
                if(temp3.get(1) == null){
                    continue;
                }
                result.add(temp3);

                map2.remove(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] nums1 = {{1,1},{4,5},{3,8}};
        int[][] nums2 = {{3,1},{1,5}};

        List<List<Integer>> ans = solve(nums1, nums2);
        System.out.println(ans);
    }
}

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
// Problem - https://takeuforward.org/data-structure/find-the-duplicate-in-an-array-of-n1-integers/
// T.C - O(n)
// S.C - O(n), because of using hashmap and hashset

public class Striver_FindDuplicate_BruteForce {
    // Using HashMap
    public static int findDuplicate1(int[] arr, int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // This is the way to traverse a Hash Table
        for(Map.Entry<Integer, Integer> ele: map.entrySet()){
            if(ele.getValue() == 2){
                ans = ele.getKey();
            }
        }
        return ans;
    }

    // Using HashSet
    public static int findDuplicate2(int[] arr, int n){
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        for(int i=0; i<n; i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
            else{
                ans = arr[i];
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        int n = arr.length;

        int ans = findDuplicate1(arr, n);
        System.out.println(ans);

        int answer = findDuplicate2(arr, n);
        System.out.println(answer);
    }
}

import java.util.HashMap;
// Problem - https://leetcode.com/problems/roman-to-integer/

// Explanation - https://www.youtube.com/watch?v=dlATMslQ6Uc

public class LeetCode_Easy_RomanToInteger {
    public static int solve(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(s.charAt(s.length() - 1));

        for(int i=s.length()-2; i>=0; i--){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                result -= map.get(s.charAt(i));
            }
            else{
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "XLIX";

        int ans = solve(str);
        System.out.println(ans);
    }
}

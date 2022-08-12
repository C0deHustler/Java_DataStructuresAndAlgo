import java.util.*;
// Problem - https://leetcode.com/problems/valid-palindrome/

public class LeetCode_Easy_ValidPalindrome {
    public static boolean checkPalindrome(List<Character> str){
        int s = 0;
        int e = str.size()-1;
        while(s < e){
            if(str.get(s) != str.get(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    public static boolean solve(String str){
        List<Character> list = new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) - 'a' >= 0 && str.charAt(i) - 'a' < 26){
                list.add(str.charAt(i));
            }
            else if(str.charAt(i) - 'A' >= 0 && str.charAt(i) - 'A' < 26){
                list.add(Character.toLowerCase(str.charAt(i)));
            }
            else if(str.charAt(i) - '0' >= 0 && str.charAt(i) - '0' < 10){
                list.add(str.charAt(i));
            }
        }

        if(checkPalindrome(list)){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        boolean ans = solve(str);
        if(ans){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        String str2 = "race a car";
        boolean ans2 = solve(str2);
        if(ans2){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        String str3 = "0P";
        boolean ans3 = solve(str3);
        if(ans3){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

// Problem - https://leetcode.com/problems/length-of-last-word/

public class LeetCode_Easy_LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int ans = 0;
        int n = s.length();

        for(int i=n-1; i>=0; i--){
            if(s.charAt(i) != ' '){
                ans++;
            }
            else{
                if(ans > 0){
                    return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "Hello world";
        int ans = lengthOfLastWord(str);
        System.out.println(ans);

        String str2 = "Fly me to the moon ";
        int ans2 = lengthOfLastWord(str2);
        System.out.println(ans2);
    }
}
